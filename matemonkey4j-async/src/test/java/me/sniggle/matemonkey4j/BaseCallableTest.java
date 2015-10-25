package me.sniggle.matemonkey4j;

/**
 * @author tuxbox, sniggle.me
 */
public class BaseCallableTest {

  private static final String PLAYGROUND_URL = "http://playground.matemonkey.com/api/";

  protected void resetBaseUrl(BaseMateMonkeyCallable<?,?> callable) {
    callable.setBaseUrl(PLAYGROUND_URL);
  }

}
