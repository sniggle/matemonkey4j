package me.sniggle.matemonkey4j.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by iulius on 25/10/15.
 */
public class StockUpdate {

  @JsonProperty("product")
  private long productId;
  private String status;
  private String quantity;
  private int price = -1;
  private boolean special = false;

  public StockUpdate() {
  }

  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(StockStatus status) {
    this.status = status.status();
  }

  public String getQuantity() {
    return quantity;
  }

  public void setQuantity(Quantity quantity) {
    this.quantity = quantity.quantity();
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public boolean isSpecial() {
    return special;
  }

  public void setSpecial(boolean special) {
    this.special = special;
  }
}
