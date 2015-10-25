package me.sniggle.matemonkey4j.stock;

import me.sniggle.matemonkey4j.BaseMateMonkeyCallable;
import me.sniggle.matemonkey4j.api.model.result.StockEntryResult;

import java.util.Map;

/**
 * @author tuxbox, sniggle.me
 *
 * Callable to query for the current stock of a dealer
 */
public class StockByDealerIdCallable extends BaseMateMonkeyCallable<Void, StockEntryResult> {

  private final long dealerId;
  private final boolean current;

  /**
   *
   * @param dealerId
   *    the ID of the dealer to query for
   */
  public StockByDealerIdCallable(long dealerId) {
    this(dealerId, true);
  }

  /**
   *
   * @param dealerId
   *    the ID of the dealer to query for
   * @param current
   *    flag indicating whether only current stock should be returned (true: current stock)
   */
  public StockByDealerIdCallable(long dealerId, boolean current) {
    super(StockEntryResult.class, "/dealers/:id/stock");
    this.dealerId = dealerId;
    this.current = current;
  }


  @Override
  protected String resolvePath() {
    StringBuilder result = new StringBuilder(getPath().replace(":id", String.valueOf(dealerId)));
    if( current ) {
      result.append("?current=true");
    }
    return result.toString();
  }

}
