package me.sniggle.matemonkey4j.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author tuxbox, sniggle.me
 */
public class StockUpdate {

  @JsonProperty("product")
  private long productId;
  private StockStatus status;
  private Quantity quantity;
  private int price = -1;
  private boolean special = false;

  public StockUpdate() {
  }

  /**
   *
   * @return the internal ID
   */
  public long getProductId() {
    return productId;
  }

  /**
   *
   * @param productId
   *    the internal ID
   */
  public void setProductId(long productId) {
    this.productId = productId;
  }

  /**
   *
   * @return the status to set
   */
  public StockStatus getStatus() {
    return status;
  }

  /**
   *
   * @param status
   *    the status to set
   */
  public void setStatus(StockStatus status) {
    this.status = status;
  }

  /**
   *
   * @return the available quantity
   */
  public Quantity getQuantity() {
    return quantity;
  }

  /**
   *
   * @param quantity
   *    the available quantity
   */
  public void setQuantity(Quantity quantity) {
    this.quantity = quantity;
  }

  /**
   *
   * @return the price
   */
  public int getPrice() {
    return price;
  }

  /**
   *
   * @param price
   *    the price
   */
  public void setPrice(int price) {
    this.price = price;
  }

  /**
   *
   * @return true if it's a special offer
   */
  public boolean isSpecial() {
    return special;
  }

  /**
   *
   * @param special
   *    true if it's a special offer
   */
  public void setSpecial(boolean special) {
    this.special = special;
  }

}
