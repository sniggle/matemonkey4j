package me.sniggle.matemonkey4j.stock;

import me.sniggle.matemonkey4j.BaseCallableTest;
import me.sniggle.matemonkey4j.api.model.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

/**
 * @author tuxbox, sniggle.me
 */
public class UpdateStockForDealerCallableTest extends BaseCallableTest {

  private UpdateStockForDealerCallable updateStockCallable;

  @Before
  public void setup() {
    Dealer dealer = new Dealer();
    dealer.setId(1L);
    StockUpdate stockUpdate = new StockUpdate();
    stockUpdate.setPrice(999);
    stockUpdate.setProductId(2l);
    stockUpdate.setQuantity(Quantity.PIECE);
    stockUpdate.setSpecial(false);
    stockUpdate.setStatus(StockStatus.FULL);
    updateStockCallable = new UpdateStockForDealerCallable(dealer, stockUpdate);
    resetBaseUrl(updateStockCallable);
  }

  @Test
  public void testCall() throws Exception {
    fail("update via api fails currently");
  }

  @After
  public void cleanUp() {
    updateStockCallable = null;
  }

}
