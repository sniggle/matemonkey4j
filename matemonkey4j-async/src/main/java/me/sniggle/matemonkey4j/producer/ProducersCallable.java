package me.sniggle.matemonkey4j.producer;

import me.sniggle.matemonkey4j.BaseMateMonkeyCallable;
import me.sniggle.matemonkey4j.api.model.result.ProducerResult;

/**
 * @author tuxbox, sniggle.me
 *
 * Callable to query for all producers
 */
public class ProducersCallable extends BaseMateMonkeyCallable<Void, ProducerResult> {

  /**
   * the default constructor
   */
  public ProducersCallable() {
    super(ProducerResult.class, "/producers");
  }

}
