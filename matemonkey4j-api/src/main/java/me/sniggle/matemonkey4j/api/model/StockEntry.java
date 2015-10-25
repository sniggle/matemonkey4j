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
   * @return the stock status
   */
  public StockStatus getStatus() {
    return status;
  }

  /**
   *
   * @param status
   *    the stock status
   */
  public void setStatus(StockStatus status) {
    this.status = status;
  }

  /**
   *
   * @return the related product
   */
  public Product getProduct() {
    return product;
  }

  /**
   *
   * @param product
   *    the related product
   */
  public void setProduct(Product product) {
    this.product = product;
  }

  /**
   *
   * @return the price
   */
  public String getPrice() {
    return price;
  }

  /**
   *
   * @param price
   *    the price
   */
  public void setPrice(String price) {
    this.price = price;
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
   * @return true if it's a special offer
   */
  public boolean isSpecial() {
    return special;
  }

  /**
   *
   * @param special true if it's a special offer
   */
  public void setSpecial(boolean special) {
    this.special = special;
  }

  /**
   *
   * @return ISO 8601 formatted timestamp of creation
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   *
   * @param createdAt
   *    ISO 8601 formatted timestamp of creation
   */
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

}
