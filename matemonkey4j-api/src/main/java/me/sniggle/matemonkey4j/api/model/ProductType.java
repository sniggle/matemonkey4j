package me.sniggle.matemonkey4j.api.model;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author tuxbox, sniggle.me
 */
public enum ProductType {

  SOFT_DRINK("soft-drink"),
  ALCOHOLIC("alcoholic"),
  SUPPLIES("supplies"),
  LEAVES("leaves"),
  FOOD("food");

  private final String id;

  ProductType(String id) {
    this.id = id;
  }

  /**
   *
   * @return the JSON representation string of the product type
   */
  @JsonValue
  public String id() {
    return id;
  }

}
