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
 * Created by iulius on 24/10/15.
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

  protected BaseMateMonkeyCallable(Class<Response> restCallResult, String path) {
    super();
    this.restCallResult = restCallResult;
    this.path = path;
  }

  protected ObjectMapper getObjectMapper() {
    return objectMapper;
  }

  protected String getPath() {
    return path;
  }

  protected String resolvePath() {
    return path;
  }

  protected Body getBody() {
    return null;
  }

  protected void validateBody(Body body) throws IOException {

  }

  protected URLConnection prepareCall(Body body) throws IOException {
    validateBody(body);
    URL url = new URL(getBaseUrl() + API_VERSION + resolvePath());
    URLConnection connection = url.openConnection();
    connection.setRequestProperty(USER_AGENT_PROP, USER_AGENT);
    return connection;
  }

  protected boolean processCall(URLConnection connection) throws IOException {
    int responseCode = ((HttpURLConnection)connection).getResponseCode();
    return  responseCode == 200;
  }

  protected InputStream postProcessCall(URLConnection connection) throws IOException {
    return connection.getInputStream();
  }

  public String getBaseUrl() {
    return baseUrl;
  }

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
