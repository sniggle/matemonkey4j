package me.sniggle.matemonkey4j;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/**
 * @author tuxbox, sniggle.me
 * @param <Body>
 * @param <Response>
 */
public abstract class BaseMateMonkeyUpdateCallable<Body, Response> extends BaseMateMonkeyCallable<Body, Response> {

  /**
   *
   * @param restCallResult
   * @param path
   */
  protected BaseMateMonkeyUpdateCallable(Class<Response> restCallResult, String path) {
    super(restCallResult, path);
  }

  @Override
  protected URLConnection prepareCall(Body body) throws IOException {
    HttpURLConnection connection = (HttpURLConnection)super.prepareCall(body);
    connection.setRequestMethod("PUT");
    connection.setDoOutput(true);
    return connection;
  }

}
