package me.sniggle.matemonkey4j.dealer;

import me.sniggle.matemonkey4j.BaseMateMonkeyCallable;
import me.sniggle.matemonkey4j.api.model.result.DealerResult;
import me.sniggle.matemonkey4j.api.query.Query;

import java.util.Map;

/**
 * Created by iulius on 24/10/15.
 */
public class DealersCallable extends BaseMateMonkeyCallable<Void, DealerResult> {

  private final Query query;

  public DealersCallable() {
    this(null);
  }

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
