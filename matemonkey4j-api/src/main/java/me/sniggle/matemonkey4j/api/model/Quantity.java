package me.sniggle.matemonkey4j.api.model;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by iulius on 22/10/15.
 */
public enum Quantity {

  CRATE("crate"),
  PIECE("piece"),
  KILOGRAMM("kg");

  private String quantity;
  Quantity(String quantity) {
    this.quantity = quantity;
  }

  @JsonValue
  public String quantity() {
    return quantity;
  }

}
