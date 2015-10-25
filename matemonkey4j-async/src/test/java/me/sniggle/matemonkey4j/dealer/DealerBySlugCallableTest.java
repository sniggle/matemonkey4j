package me.sniggle.matemonkey4j.dealer;

import me.sniggle.matemonkey4j.api.model.Dealer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by iulius on 25/10/15.
 */
public class DealerBySlugCallableTest extends GetDealerByCallableTest {

  private DealerBySlugCallable dealersCallable;

  @Before
  public void setup() {
    dealersCallable = new DealerBySlugCallable("getraenkemarkt-am-isartor");
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
