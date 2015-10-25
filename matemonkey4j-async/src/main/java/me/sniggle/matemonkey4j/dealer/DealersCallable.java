package me.sniggle.matemonkey4j.dealer;

import me.sniggle.matemonkey4j.BaseMateMonkeyCallable;
import me.sniggle.matemonkey4j.api.model.result.DealerResult;
import me.sniggle.matemonkey4j.api.query.Query;

import java.util.Map;

/**
 * @author tuxbox, sniggle.me
 */
public class DealersCallable extends BaseMateMonkeyCallable<Void, DealerResult> {

  private final Query query;

  /**
   *
   */
  public DealersCallable() {
    this(null);
  }

  /**
   *
   * @param query
   */
  public DealersCallable(Query query) {
    super(DealerResult.class, "/dealers");
    this.query = query;
  }

  @Override
  protected String resolvePath() {
    String paramString = (query == null || query.toQuery() == null ) ? null : query.toQuery();
    return (paramString == null) ? getPath() : (getPath()+"?"+paramString);
  }
}
