package me.sniggle.matemonkey4j.product;

import me.sniggle.matemonkey4j.api.model.result.ProductResult;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author tuxbox, sniggle.me
 */
public class ProductsByProducerCallableTest {

  private ProductsByProducerCallable productsCallable;

  @Before
  public void setup() {
    productsCallable = new ProductsByProducerCallable(1);
  }

  @Test
  public void testCall() throws Exception {
    ProductResult productResult = productsCallable.call();
    assertNotNull(productResult);
    assertEquals(6, productResult.getCount());
    assertNotNull(productResult.getProducts());
    assertEquals(6, productResult.getProducts().size());
  }

  @After
  public void  cleanUp() {
    productsCallable = null;
  }

}
