package me.sniggle.matemonkey4j.api.model.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import me.sniggle.matemonkey4j.api.model.Product;

import java.util.List;

/**
 * @author tuxbox, sniggle.me
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProductResult {

  private long count;
  private List<Product> products;

  public ProductResult() {
  }

  /**
   *
   * @return
   */
  public long getCount() {
    return count;
  }

  /**
   *
   * @param count
   */
  public void setCount(long count) {
    this.count = count;
  }

  /**
   *
   * @return
   */
  public List<Product> getProducts() {
    return products;
  }

  /**
   *
   * @param products
   */
  public void setProducts(List<Product> products) {
    this.products = products;
  }

}
