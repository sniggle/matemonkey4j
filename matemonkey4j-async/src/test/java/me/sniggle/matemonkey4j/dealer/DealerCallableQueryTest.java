package me.sniggle.matemonkey4j.dealer;

import me.sniggle.matemonkey4j.BaseCallableTest;
import me.sniggle.matemonkey4j.api.model.DealerType;
import me.sniggle.matemonkey4j.api.model.result.DealerResult;
import me.sniggle.matemonkey4j.api.query.DealerQueryBuilder;
import me.sniggle.matemonkey4j.api.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author tuxbox, sniggle.me
 */
public class DealerCallableQueryTest extends BaseCallableTest {

  private DealersCallable dealersCallable;

  @Before
  public void setup() {
    Query query = DealerQueryBuilder
        .create()
        .bbox(47.858960625924794, 11.21480941772461, 48.38699007140056, 11.880855560302734)
        .addDealerType(DealerType.RETAIL)
        .addDealerType(DealerType.CLUB)
        .addProductId("1")
        .addProductId("2")
        .build();
    dealersCallable = new DealersCallable(query);
    resetBaseUrl(dealersCallable);
  }

  @Test
  public void testCall() throws Exception {
    DealerResult result = dealersCallable.call();
    assertNotNull(result);
    assertTrue(result.getCount() >= 92);
    assertNotNull(result.getDealers());
    assertTrue(result.getDealers().size() >= 92);
    assertEquals(result.getCount(), result.getDealers().size());
  }

  @After
  public void cleanUp() {
    dealersCallable = null;
  }

}
