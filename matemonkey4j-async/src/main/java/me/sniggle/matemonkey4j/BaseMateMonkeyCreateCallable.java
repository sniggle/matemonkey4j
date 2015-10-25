package me.sniggle.matemonkey4j;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/**
 * @author tuxbox, sniggle.me
 *
 * performs the POST requests
 *
 * @param <Body>
 *    the type we sent as request body
 * @param <Response>
 *    the type we expect as response
 */
public abstract class BaseMateMonkeyCreateCallable<Body, Response> extends BaseMateMonkeyCallable<Body, Response> {

  /**
   *
   * @param restCallResult
   *    the class of the expected response
   * @param path
   *    the path of the API to query
   */
  protected BaseMateMonkeyCreateCallable(Class<Response> restCallResult, String path) {
    super(restCallResult, path);
  }

  @Override
  protected URLConnection prepareCall(Body body) throws IOException {
    HttpURLConnection connection = (HttpURLConnection)super.prepareCall(body);
    connection.setRequestMethod("POST");
    connection.setDoOutput(true);
    return connection;
  }

}
