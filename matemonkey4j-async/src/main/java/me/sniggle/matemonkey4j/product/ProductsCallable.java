package me.sniggle.matemonkey4j.product;

import me.sniggle.matemonkey4j.BaseMateMonkeyCallable;
import me.sniggle.matemonkey4j.api.model.result.ProductResult;

/**
 * @author tuxbox, sniggle.me
 *
 * Callable to query for all products
 */
public class ProductsCallable extends BaseMateMonkeyCallable<Void, ProductResult> {

  /**
   * the default constructor
   */
  public ProductsCallable() {
    super(ProductResult.class, "/products");
  }

}
