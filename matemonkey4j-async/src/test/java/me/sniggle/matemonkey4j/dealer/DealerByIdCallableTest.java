package me.sniggle.matemonkey4j.dealer;

import me.sniggle.matemonkey4j.api.model.Dealer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author tuxbox, sniggle.me
 */
public class DealerByIdCallableTest extends GetDealerByCallableTest {

  private DealerByIdCallable dealersCallable;

  @Before
  public void setup() {
    dealersCallable = new DealerByIdCallable(2450);
    resetBaseUrl(dealersCallable);
  }

  @Test
  public void testCall() throws Exception {
    Dealer result = dealersCallable.call();
    assertResult(result);
  }

  @After
  public void cleanUp() {
    dealersCallable = null;
  }

}
