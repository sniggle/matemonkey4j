package me.sniggle.matemonkey4j;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/**
 * Created by iulius on 25/10/15.
 */
public abstract class BaseMateMonkeyCreateCallable<Body, Response> extends BaseMateMonkeyCallable<Body, Response> {

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
