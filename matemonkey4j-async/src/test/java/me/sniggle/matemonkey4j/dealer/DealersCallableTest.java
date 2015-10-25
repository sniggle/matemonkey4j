package me.sniggle.matemonkey4j.dealer;

import me.sniggle.matemonkey4j.BaseCallableTest;
import me.sniggle.matemonkey4j.api.model.Dealer;
import me.sniggle.matemonkey4j.api.model.result.DealerResult;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author tuxbox, sniggle.me
 */
public class DealersCallableTest extends BaseCallableTest {

  private DealersCallable dealersCallable;

  @Before
  public void setup() {
    dealersCallable = new DealersCallable();
    resetBaseUrl(dealersCallable);
  }

  @Test
  public void testCall() throws Exception {
    DealerResult result = dealersCallable.call();
    assertNotNull(result);
    assertTrue(result.getCount() >= 3429);
    assertNotNull(result.getDealers());
    assertTrue(result.getDealers().size() >= 3429);
    assertEquals(result.getCount(), result.getDealers().size());
  }

  @After
  public void cleanUp() {
    dealersCallable = null;
  }

}
