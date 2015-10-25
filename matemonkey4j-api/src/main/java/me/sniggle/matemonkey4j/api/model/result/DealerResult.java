package me.sniggle.matemonkey4j.api.model.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import me.sniggle.matemonkey4j.api.model.Dealer;

import java.util.List;

/**
 * @author tuxbox, sniggle.me
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DealerResult {

  private long count;
  private List<Dealer> dealers;

  public DealerResult() {
  }

  /**
   *
   * @return
   */
  public long getCount() {
    return count;
  }

  /**
   *
   * @param count
   */
  public void setCount(long count) {
    this.count = count;
  }

  /**
   *
   * @return
   */
  public List<Dealer> getDealers() {
    return dealers;
  }

  /**
   *
   * @param dealers
   */
  public void setDealers(List<Dealer> dealers) {
    this.dealers = dealers;
  }

}
