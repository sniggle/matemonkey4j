package me.sniggle.matemonkey4j;

/**
 * Created by iulius on 25/10/15.
 */
public class BaseCallableTest {

  private static final String PLAYGROUND_URL = "http://playground.matemonkey.com/api";

  protected void resetBaseUrl(BaseMateMonkeyCallable<?,?> callable) {
    callable.setBaseUrl(PLAYGROUND_URL);
  }

}
