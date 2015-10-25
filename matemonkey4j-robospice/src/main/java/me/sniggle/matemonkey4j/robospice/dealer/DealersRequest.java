package me.sniggle.matemonkey4j.robospice.dealer;

import me.sniggle.matemonkey4j.api.model.result.DealerResult;
import me.sniggle.matemonkey4j.api.query.Query;
import me.sniggle.matemonkey4j.dealer.DealersCallable;
import me.sniggle.matemonkey4j.robospice.BaseMateMonkeyRequest;

/**
 * @author tuxbox, sniggle.me
 *
 * Request wrapper for DealersCallable
 */
public class DealersRequest extends BaseMateMonkeyRequest<DealerResult> {

  /**
   * default constructor requesting all dealers
   */
  public DealersRequest() {
    this(null);
  }

  /**
   *
   * @param query
   *    the query to limit returned dealers
   */
  public DealersRequest(Query query) {
    super(DealerResult.class, new DealersCallable(query));
  }

}
