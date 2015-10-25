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

  /**
   *
   * @return the element count in producers
   */
  public long getCount() {
    return count;
  }

  /**
   *
   * @param count
   *    the element count in producers
   */
  public void setCount(long count) {
    this.count = count;
  }

  /**
   *
   * @return the mate producers
   */
  public List<Producer> getProducers() {
    return producers;
  }

  /**
   *
   * @param producers
   *    the mate producers in the result
   */
  public void setProducers(List<Producer> producers) {
    this.producers = producers;
  }
}
