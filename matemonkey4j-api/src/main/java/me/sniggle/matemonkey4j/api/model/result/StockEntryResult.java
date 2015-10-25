package me.sniggle.matemonkey4j.api.model.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import me.sniggle.matemonkey4j.api.model.StockEntry;

import java.util.List;

/**
 * @author tuxbox, sniggle.me
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class StockEntryResult {

  private long count;
  private List<StockEntry> entries;

  public StockEntryResult() {
  }

  /**
   *
   * @return the element count in entries
   */
  public long getCount() {
    return count;
  }

  /**
   *
   * @param count
   *    the element count in entries
   */
  public void setCount(long count) {
    this.count = count;
  }

  /**
   *
   * @return the stock entries
   */
  public List<StockEntry> getEntries() {
    return entries;
  }

  /**
   *
   * @param entries
   *    the stock entries
   */
  public void setEntries(List<StockEntry> entries) {
    this.entries = entries;
  }
}
