package me.sniggle.matemonkey4j.robospice.producer;

import me.sniggle.matemonkey4j.api.model.result.ProducerResult;
import me.sniggle.matemonkey4j.producer.ProducersCallable;
import me.sniggle.matemonkey4j.robospice.BaseMateMonkeyRequest;

/**
 * @author tuxbox, sniggle.me
 *
 * Request wrapper for ProducersCallable
 */
public class ProducersRequest extends BaseMateMonkeyRequest<ProducerResult> {

  /**
   * default constructor requesting all producers
   */
  public ProducersRequest() {
    super(ProducerResult.class, new ProducersCallable());
  }

}
