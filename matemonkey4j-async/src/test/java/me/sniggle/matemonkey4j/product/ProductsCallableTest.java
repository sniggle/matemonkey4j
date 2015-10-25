package me.sniggle.matemonkey4j.product;

import me.sniggle.matemonkey4j.api.model.result.ProductResult;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author tuxbox, sniggle.me
 */
public class ProductsCallableTest {

  private ProductsCallable productsCallable;

  @Before
  public void setup() {
    productsCallable = new ProductsCallable();
  }

  @Test
  public void testCall() throws Exception {
    ProductResult productResult = productsCallable.call();
    assertNotNull(productResult);
    assertTrue(productResult.getCount() >= 44);
    assertNotNull(productResult.getProducts());
    assertTrue(productResult.getProducts().size() >= 44);
    assertEquals(productResult.getCount(), productResult.getProducts().size());
  }

  @After
  public void  cleanUp() {
    productsCallable = null;
  }

}
