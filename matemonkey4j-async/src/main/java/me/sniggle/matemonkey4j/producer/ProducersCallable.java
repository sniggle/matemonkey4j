package me.sniggle.matemonkey4j.producer;

import me.sniggle.matemonkey4j.BaseMateMonkeyCallable;
import me.sniggle.matemonkey4j.api.model.result.ProducerResult;

/**
 * Created by iulius on 25/10/15.
 */
public class ProducersCallable extends BaseMateMonkeyCallable<Void, ProducerResult> {

  public ProducersCallable() {
    super(ProducerResult.class, "/producers");
  }

}
