package me.sniggle.matemonkey4j.robospice.dealer;

import me.sniggle.matemonkey4j.api.model.Dealer;
import me.sniggle.matemonkey4j.dealer.DealerBySlugCallable;
import me.sniggle.matemonkey4j.robospice.BaseMateMonkeyRequest;

/**
 * @author tuxbox, sniggle.me
 *
 * Request wrapper for DealerBySlugCallable
 */
public class DealerBySlugRequest extends BaseMateMonkeyRequest<Dealer> {

  /**
   *
   * @param slug
   *    the slug name
   */
  public DealerBySlugRequest(String slug) {
    super(Dealer.class, new DealerBySlugCallable(slug));
  }

}
