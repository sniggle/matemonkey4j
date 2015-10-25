package me.sniggle.matemonkey4j.product;

import me.sniggle.matemonkey4j.api.model.result.ProductResult;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by iulius on 25/10/15.
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
    assertEquals(44, productResult.getCount());
    assertNotNull(productResult.getProducts());
    assertEquals(44, productResult.getProducts().size());
  }

  @After
  public void  cleanUp() {
    productsCallable = null;
  }

}
