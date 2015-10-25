package me.sniggle.matemonkey4j.api.model;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author tuxbox, sniggle.me
 */
public enum Quantity {

  CRATE("crate"),
  PIECE("piece"),
  KILOGRAMM("kg");

  private String quantity;
  Quantity(String quantity) {
    this.quantity = quantity;
  }

  /**
   *
   * @return the JSON string representation of the allowed quantities
   */
  @JsonValue
  public String quantity() {
    return quantity;
  }

}
