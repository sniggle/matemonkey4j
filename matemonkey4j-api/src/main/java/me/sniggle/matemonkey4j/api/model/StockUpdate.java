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
   * @return
   */
  public long getProductId() {
    return productId;
  }

  /**
   *
   * @param productId
   */
  public void setProductId(long productId) {
    this.productId = productId;
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
  public int getPrice() {
    return price;
  }

  /**
   *
   * @param price
   */
  public void setPrice(int price) {
    this.price = price;
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

}
