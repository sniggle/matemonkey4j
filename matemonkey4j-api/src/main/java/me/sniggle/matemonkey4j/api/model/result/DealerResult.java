package me.sniggle.matemonkey4j.api.model.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import me.sniggle.matemonkey4j.api.model.Dealer;

import java.util.List;

/**
 * Created by iulius on 22/10/15.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DealerResult {

  private long count;
  private List<Dealer> dealers;

  public DealerResult() {
  }

  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }

  public List<Dealer> getDealers() {
    return dealers;
  }

  public void setDealers(List<Dealer> dealers) {
    this.dealers = dealers;
  }
}
