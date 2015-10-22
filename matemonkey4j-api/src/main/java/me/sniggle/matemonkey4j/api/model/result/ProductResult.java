package me.sniggle.matemonkey4j.api.model.result;

import me.sniggle.matemonkey4j.api.model.Product;

import java.util.List;

/**
 * Created by iulius on 22/10/15.
 */
public class ProductResult {

  private long count;
  private List<Product> products;

  public ProductResult() {
  }

  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

}
