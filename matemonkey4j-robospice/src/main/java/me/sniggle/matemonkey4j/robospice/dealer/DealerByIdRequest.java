package me.sniggle.matemonkey4j.robospice.dealer;

import me.sniggle.matemonkey4j.api.model.Dealer;
import me.sniggle.matemonkey4j.dealer.DealerByIdCallable;
import me.sniggle.matemonkey4j.robospice.BaseMateMonkeyRequest;

/**
 * @author tuxbox, sniggle.me
 *
 * Request wrapper for DealerByIdCallable
 */
public class DealerByIdRequest extends BaseMateMonkeyRequest<Dealer> {

  /**
   *
   * @param id
   *    the id of the dealer to request
   */
  public DealerByIdRequest(long id) {
    super(Dealer.class, new DealerByIdCallable(id));
  }

}
