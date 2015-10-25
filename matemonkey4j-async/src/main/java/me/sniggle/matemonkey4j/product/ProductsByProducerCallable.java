package me.sniggle.matemonkey4j.product;

import me.sniggle.matemonkey4j.BaseMateMonkeyCallable;
import me.sniggle.matemonkey4j.api.model.Product;
import me.sniggle.matemonkey4j.api.model.result.ProductResult;

import java.util.Map;

/**
 * Created by iulius on 25/10/15.
 */
public class ProductsByProducerCallable extends BaseMateMonkeyCallable<Void, ProductResult> {

  private final String id;

  public ProductsByProducerCallable(String id) {
    super(ProductResult.class, "/producers/:id/products");
    this.id = id;
  }

  @Override
  protected String resolvePath() {
    return getPath().replace(":id", id);
  }

}
