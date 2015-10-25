package me.sniggle.matemonkey4j.robospice.dealer;

import me.sniggle.matemonkey4j.api.model.Dealer;
import me.sniggle.matemonkey4j.dealer.UpdateDealerCallable;
import me.sniggle.matemonkey4j.robospice.BaseMateMonkeyRequest;

/**
 * @author tuxbox, sniggle.me
 *
 * Request wrapper for UpdateDealerCallable
 */
public class UpdateDealerRequest extends BaseMateMonkeyRequest<Dealer> {

  /**
   *
   * @param dealer
   *    the dealer to update
   */
  public UpdateDealerRequest(Dealer dealer) {
    super(Dealer.class, new UpdateDealerCallable(dealer));
  }

}
