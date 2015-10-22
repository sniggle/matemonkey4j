package me.sniggle.matemonkey4j.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by iulius on 22/10/15.
 */
public class StockEntry {

  private Product product;
  private StockStatus status;
  private String price;
  private Quantity quantity;
  private boolean special;
  @JsonProperty("created_at")
  private String createdAt;

  public StockEntry() {
  }

  public StockStatus getStatus() {
    return status;
  }

  public void setStatus(StockStatus status) {
    this.status = status;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public Quantity getQuantity() {
    return quantity;
  }

  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }

  public boolean isSpecial() {
    return special;
  }

  public void setSpecial(boolean special) {
    this.special = special;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
}
