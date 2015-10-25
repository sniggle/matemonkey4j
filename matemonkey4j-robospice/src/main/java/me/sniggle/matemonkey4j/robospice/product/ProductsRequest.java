package me.sniggle.matemonkey4j.robospice.product;

import me.sniggle.matemonkey4j.api.model.result.ProductResult;
import me.sniggle.matemonkey4j.product.ProductsCallable;
import me.sniggle.matemonkey4j.robospice.BaseMateMonkeyRequest;

/**
 * @author tuxbox, sniggle.me
 *
 * Request wrapper for ProductsCallable
 */
public class ProductsRequest extends BaseMateMonkeyRequest<ProductResult> {

  /**
   * default constructor
   */
  public ProductsRequest() {
    super(ProductResult.class, new ProductsCallable());
  }

}
