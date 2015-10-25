package me.sniggle.matemonkey4j.stock;

import me.sniggle.matemonkey4j.BaseCallableTest;
import me.sniggle.matemonkey4j.api.model.StockEntry;
import me.sniggle.matemonkey4j.api.model.result.StockEntryResult;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author tuxbox, sniggle.me
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
    assertTrue(result.getCount() >= 2);
    assertNotNull(result.getEntries());
    assertTrue(result.getEntries().size() >= 2);
    assertEquals(result.getCount(), result.getEntries().size());
  }

  @After
  public void cleanUp() {
    stockCallable = null;
  }

}
