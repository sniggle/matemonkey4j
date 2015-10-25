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
   * @return the element count in products
   */
  public long getCount() {
    return count;
  }

  /**
   *
   * @param count
   *    the element count in products
   */
  public void setCount(long count) {
    this.count = count;
  }

  /**
   *
   * @return the products in the result
   */
  public List<Product> getProducts() {
    return products;
  }

  /**
   *
   * @param products
   *    the products in the result
   */
  public void setProducts(List<Product> products) {
    this.products = products;
  }

}
