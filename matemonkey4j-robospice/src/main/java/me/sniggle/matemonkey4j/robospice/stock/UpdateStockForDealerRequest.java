package me.sniggle.matemonkey4j.robospice.stock;

import me.sniggle.matemonkey4j.api.model.Dealer;
import me.sniggle.matemonkey4j.api.model.StockUpdate;
import me.sniggle.matemonkey4j.robospice.BaseMateMonkeyRequest;
import me.sniggle.matemonkey4j.stock.UpdateStockForDealerCallable;

/**
 * @author tuxbox, sniggle.me
 */
public class UpdateStockForDealerRequest extends BaseMateMonkeyRequest<Void> {

  /**
   *
   * @param dealer
   *    the dealer who's stock shall be updated
   * @param stockUpdate
   *    the new stock info
   */
  public UpdateStockForDealerRequest(Dealer dealer, StockUpdate stockUpdate) {
    super(Void.class, new UpdateStockForDealerCallable(dealer, stockUpdate));
  }

}
