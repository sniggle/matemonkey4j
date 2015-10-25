package me.sniggle.matemonkey4j.robospice.stock;

import me.sniggle.matemonkey4j.api.model.result.StockEntryResult;
import me.sniggle.matemonkey4j.robospice.BaseMateMonkeyRequest;
import me.sniggle.matemonkey4j.stock.StockByDealerIdCallable;

/**
 * @author tuxbox, sniggle.me
 *
 * Request wrapper for StockByDealerIdCallable
 */
public class StockByDealerIdRequest extends BaseMateMonkeyRequest<StockEntryResult> {

  /**
   *
   * @param dealerId
   *    the id of the dealer to request its stock for
   */
  public StockByDealerIdRequest(long dealerId) {
    this(dealerId, true);
  }

  /**
   *
   * @param dealerId
   *    the id of the dealer to request its stock for
   * @param current
   *    indicator whether only current stock shall be request (true: current stock only)
   */
  public StockByDealerIdRequest(long dealerId, boolean current) {
    super(StockEntryResult.class, new StockByDealerIdCallable(dealerId, current));
  }

}
