package me.sniggle.matemonkey4j.product;

import me.sniggle.matemonkey4j.BaseMateMonkeyCallable;
import me.sniggle.matemonkey4j.api.model.Product;
import me.sniggle.matemonkey4j.api.model.result.ProductResult;

import java.util.Map;

/**
 * @author tuxbox, sniggle.me
 *
 * Callable to query for products by a certain producer
 */
public class ProductsByProducerCallable extends BaseMateMonkeyCallable<Void, ProductResult> {

  private final long id;

  /**
   *
   * @param id
   *    the producers id
   */
  public ProductsByProducerCallable(long id) {
    super(ProductResult.class, "/producers/:id/products");
    this.id = id;
  }

  @Override
  protected String resolvePath() {
    return getPath().replace(":id", String.valueOf(id));
  }

}
