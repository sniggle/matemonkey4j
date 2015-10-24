package me.sniggle.matemonkey4j.dealer;

import me.sniggle.matemonkey4j.BaseMateMonkeyCallable;
import me.sniggle.matemonkey4j.api.model.result.DealerResult;

import java.io.InputStream;
import java.util.concurrent.Callable;

/**
 * Created by iulius on 24/10/15.
 */
public class AllDealersCallable extends BaseMateMonkeyCallable<DealerResult> {

  public AllDealersCallable() {
    super(DealerResult.class, "");
  }

}
