package me.sniggle.matemonkey4j.robospice.product;

import me.sniggle.matemonkey4j.api.model.result.ProductResult;
import me.sniggle.matemonkey4j.product.ProductsByProducerCallable;
import me.sniggle.matemonkey4j.robospice.BaseMateMonkeyRequest;

/**
 * @author tuxbox, sniggle.me
 *
 * Request wrapper for ProductsByProducerCallable
 */
public class ProductsByProducerRequest extends BaseMateMonkeyRequest<ProductResult> {

  /**
   *
   * @param producerId
   *    the id of the producer to request products for
   */
  public ProductsByProducerRequest(long producerId) {
    super(ProductResult.class, new ProductsByProducerCallable(producerId));
  }

}
