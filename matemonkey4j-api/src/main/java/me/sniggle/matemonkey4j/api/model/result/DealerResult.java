package me.sniggle.matemonkey4j.api.model.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import me.sniggle.matemonkey4j.api.model.Dealer;

import java.util.List;

/**
 * @author tuxbox, sniggle.me
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DealerResult {

  private long count;
  private List<Dealer> dealers;

  public DealerResult() {
  }

  /**
   *
   * @return the element count in dealers
   */
  public long getCount() {
    return count;
  }

  /**
   *
   * @param count
   *    the element count of dealers
   */
  public void setCount(long count) {
    this.count = count;
  }

  /**
   *
   * @return the dealers in the result
   */
  public List<Dealer> getDealers() {
    return dealers;
  }

  /**
   *
   * @param dealers
   *    the dealers
   */
  public void setDealers(List<Dealer> dealers) {
    this.dealers = dealers;
  }

}
