package me.sniggle.matemonkey4j.api.model.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import me.sniggle.matemonkey4j.api.model.Producer;

import java.util.List;

/**
 * @author tuxbox, sniggle.me
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProducerResult {

  private long count;
  private List<Producer> producers;

  public ProducerResult() {
  }

  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }

  public List<Producer> getProducers() {
    return producers;
  }

  public void setProducers(List<Producer> producers) {
    this.producers = producers;
  }
}
