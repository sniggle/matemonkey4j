package me.sniggle.matemonkey4j.stock;

import me.sniggle.matemonkey4j.BaseMateMonkeyCallable;
import me.sniggle.matemonkey4j.api.model.result.StockEntryResult;

import java.util.Map;

/**
 * Created by iulius on 25/10/15.
 */
public class StockByDealerIdCallable extends BaseMateMonkeyCallable<Void, StockEntryResult> {

  private final long dealerId;
  private final boolean current;

  public StockByDealerIdCallable(long dealerId) {
    this(dealerId, true);
  }

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
