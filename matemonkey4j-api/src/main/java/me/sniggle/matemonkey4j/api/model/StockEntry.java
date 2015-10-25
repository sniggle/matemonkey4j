package me.sniggle.matemonkey4j.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author tuxbox, sniggle.me
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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

  /**
   *
   * @return
   */
  public StockStatus getStatus() {
    return status;
  }

  /**
   *
   * @param status
   */
  public void setStatus(StockStatus status) {
    this.status = status;
  }

  /**
   *
   * @return
   */
  public Product getProduct() {
    return product;
  }

  /**
   *
   * @param product
   */
  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   *
   * @return
   */
  public String getPrice() {
    return price;
  }

  /**
   *
   * @param price
   */
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   *
   * @return
   */
  public Quantity getQuantity() {
    return quantity;
  }

  /**
   *
   * @param quantity
   */
  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }

  /**
   *
   * @return
   */
  public boolean isSpecial() {
    return special;
  }

  /**
   *
   * @param special
   */
  public void setSpecial(boolean special) {
    this.special = special;
  }

  /**
   *
   * @return
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   *
   * @param createdAt
   */
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

}
