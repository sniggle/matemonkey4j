package me.sniggle.matemonkey4j;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.sniggle.matemonkey4j.api.model.*;
import me.sniggle.matemonkey4j.api.model.Error;
import me.sniggle.matemonkey4j.api.model.result.DealerResult;

import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * @author tuxbox, sniggle.me
 * @param <Body>
 * @param <Response>
 */
public abstract class BaseMateMonkeyCallable<Body, Response> implements Callable<Response> {

  private static final String USER_AGENT_PROP = "User-Agent";
  private static final String USER_AGENT = "matemonkey4j";

  private static final String BASE_URL = "http://matemonkey.com/api/";
  private static final String API_VERSION = "v1";

  private final ObjectMapper objectMapper = new ObjectMapper();
  private final String path;
  private final Class<Response> restCallResult;
  private String baseUrl = BASE_URL;

  /**
   *
   * @param restCallResult
   * @param path
   */
  protected BaseMateMonkeyCallable(Class<Response> restCallResult, String path) {
    super();
    this.restCallResult = restCallResult;
    this.path = path;
  }

  /**
   *
   * @return
   */
  protected ObjectMapper getObjectMapper() {
    return objectMapper;
  }

  /**
   *
   * @return
   */
  protected String getPath() {
    return path;
  }

  /**
   *
   * @return
   */
  protected String resolvePath() {
    return path;
  }

  /**
   *
   * @return
   */
  protected Body getBody() {
    return null;
  }

  /**
   *
   * @param body
   * @throws IOException
   */
  protected void validateBody(Body body) throws IOException {

  }

  /**
   *
   * @param body
   * @return
   * @throws IOException
   */
  protected URLConnection prepareCall(Body body) throws IOException {
    validateBody(body);
    URL url = new URL(getBaseUrl() + API_VERSION + resolvePath());
    URLConnection connection = url.openConnection();
    connection.setRequestProperty(USER_AGENT_PROP, USER_AGENT);
    return connection;
  }

  /**
   *
   * @param connection
   * @return
   * @throws IOException
   */
  protected boolean processCall(URLConnection connection) throws IOException {
    int responseCode = ((HttpURLConnection)connection).getResponseCode();
    return  responseCode == 200;
  }

  /**
   *
   * @param connection
   * @return
   * @throws IOException
   */
  protected InputStream postProcessCall(URLConnection connection) throws IOException {
    return connection.getInputStream();
  }

  /**
   *
   * @return
   */
  public String getBaseUrl() {
    return baseUrl;
  }

  /**
   *
   * @param baseUrl
   */
  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  @Override
  public Response call() throws Exception {
    Response result = null;
    URLConnection connection = prepareCall(getBody());
    if( processCall(connection) ) {
      try (InputStream in = postProcessCall(connection)) {
        result = getObjectMapper()
            .readerFor(restCallResult)
            .readValue(in);
      }
    } else {
      Object content = connection.getContent();
      try(InputStream in = postProcessCall(connection) ) {
        me.sniggle.matemonkey4j.api.model.Error error = getObjectMapper()
            .readerFor(Error.class)
            .readValue(in);
        System.out.println(error.getTitle());
      }
    }
    return result;
  }

}
