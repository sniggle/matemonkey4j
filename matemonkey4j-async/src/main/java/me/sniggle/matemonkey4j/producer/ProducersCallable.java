package me.sniggle.matemonkey4j.producer;

import me.sniggle.matemonkey4j.BaseMateMonkeyCallable;
import me.sniggle.matemonkey4j.api.model.result.ProducerResult;

/**
 * @author tuxbox, sniggle.me
 */
public class ProducersCallable extends BaseMateMonkeyCallable<Void, ProducerResult> {

  /**
   *
   */
  public ProducersCallable() {
    super(ProducerResult.class, "/producers");
  }

}
