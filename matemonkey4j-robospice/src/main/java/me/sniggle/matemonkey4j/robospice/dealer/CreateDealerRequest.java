package me.sniggle.matemonkey4j.robospice.dealer;

import me.sniggle.matemonkey4j.api.model.Dealer;
import me.sniggle.matemonkey4j.dealer.CreateDealerCallable;
import me.sniggle.matemonkey4j.robospice.BaseMateMonkeyRequest;

/**
 * @author tuxbox, sniggle.me
 *
 * Request Wrapper for CreateDealerCallable
 */
public class CreateDealerRequest extends BaseMateMonkeyRequest<Dealer> {

  /**
   *
   * @param dealer
   *    the dealer to create
   */
  public CreateDealerRequest(Dealer dealer) {
    super(Dealer.class, new CreateDealerCallable(dealer));
  }

}
