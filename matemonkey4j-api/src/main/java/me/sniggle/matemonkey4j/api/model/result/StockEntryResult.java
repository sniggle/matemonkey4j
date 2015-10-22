package me.sniggle.matemonkey4j.api.model.result;

import me.sniggle.matemonkey4j.api.model.StockEntry;

import java.util.List;

/**
 * Created by iulius on 22/10/15.
 */
public class StockEntryResult {

  private long count;
  private List<StockEntry> entries;

  public StockEntryResult() {
  }

  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }

  public List<StockEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<StockEntry> entries) {
    this.entries = entries;
  }
}
