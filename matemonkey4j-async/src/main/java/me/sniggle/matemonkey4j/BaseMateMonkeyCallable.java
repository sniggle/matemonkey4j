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
 *
 * the base callable class to unify API querying
 *
 * @param <Body>
 *    the type we sent as request body
 * @param <Response>
 *    the type we expect as response
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
   *    the class of the expected response
   * @param path
   *    the path of the API to query
   */
  protected BaseMateMonkeyCallable(Class<Response> restCallResult, String path) {
    super();
    this.restCallResult = restCallResult;
    this.path = path;
  }

  /**
   *
   * @return the object mapper for object (de)serialization
   */
  protected ObjectMapper getObjectMapper() {
    return objectMapper;
  }

  /**
   *
   * @return the path segment of the API to query
   */
  protected String getPath() {
    return path;
  }

  /**
   * resolves the path and replaces variables in the base path
   *
   * @return the actual path with resolved parameters
   */
  protected String resolvePath() {
    return path;
  }

  /**
   *
   * @return the message body to serialize
   */
  protected Body getBody() {
    return null;
  }

  /**
   * validates the
   *
   * @param body
   *    the body to validate whether it meets basic requirements of the API
   * @throws IOException
   */
  protected void validateBody(Body body) throws IOException {

  }

  /**
   * prepares the API call, by validating and setting the user agent
   *
   * @param body
   *    the body to sent with the request as body
   * @return the prepared URL connection
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
   * processes the request
   *
   * @param connection
   *    the connection of the request to process
   * @return true if the response code matches the expected response code
   * @throws IOException
   */
  protected boolean processCall(URLConnection connection) throws IOException {
    int responseCode = ((HttpURLConnection)connection).getResponseCode();
    return  responseCode == 200;
  }

  /**
   *
   * @param connection
   *    the connection to handle
   * @return the input stream containing the response
   * @throws IOException
   */
  protected InputStream postProcessCall(URLConnection connection) throws IOException {
    return connection.getInputStream();
  }

  /**
   *
   * @return the base API url to use
   */
  public String getBaseUrl() {
    return baseUrl;
  }

  /**
   *
   * @param baseUrl
   *    the base url to use
   */
  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  /**
   * performs the API call
   * @return
   * @throws Exception
   */
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
