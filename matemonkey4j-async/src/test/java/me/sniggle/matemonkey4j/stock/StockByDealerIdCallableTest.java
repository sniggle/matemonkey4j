package me.sniggle.matemonkey4j.stock;

import me.sniggle.matemonkey4j.BaseCallableTest;
import me.sniggle.matemonkey4j.api.model.StockEntry;
import me.sniggle.matemonkey4j.api.model.result.StockEntryResult;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by iulius on 25/10/15.
 */
public class StockByDealerIdCallableTest extends BaseCallableTest {

  private StockByDealerIdCallable stockCallable;

  @Before
  public void setup() {
    stockCallable = new StockByDealerIdCallable(2450);
    resetBaseUrl(stockCallable);
  }

  @Test
  public void testCall() throws Exception {
    StockEntryResult result = stockCallable.call();
    assertNotNull(result);
    assertEquals(4, result.getCount());
    assertNotNull(result.getEntries());
    assertEquals(4, result.getEntries().size());
  }

  @After
  public void cleanUp() {
    stockCallable = null;
  }

}
