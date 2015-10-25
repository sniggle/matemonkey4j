package me.sniggle.matemonkey4j.robospice;

import com.octo.android.robospice.request.SpiceRequest;

import java.util.concurrent.Callable;

/**
 * @author tuxbox, sniggle.me
 *
 * Generic MateMonkeyRequest implementation used for all specific API request
 */
public abstract class BaseMateMonkeyRequest<Response> extends SpiceRequest<Response> {

  private final Callable<Response> delegate;

  /**
   *
   * @param clazz
   *    the response type
   * @param callable
   *    the delegate to perform the API call
   */
  protected BaseMateMonkeyRequest(Class<Response> clazz, Callable<Response> callable) {
    super(clazz);
    this.delegate = callable;
  }

  @Override
  public Response loadDataFromNetwork() throws Exception {
    return delegate.call();
  }
}
