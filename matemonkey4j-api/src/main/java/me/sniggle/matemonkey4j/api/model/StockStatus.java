package me.sniggle.matemonkey4j.api.model;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author tuxbox, sniggle.me
 */
public enum StockStatus {

  UNKNOWN("unknown"),
  FULL("full"),
  LOW("low"),
  SOLD_OUT("sold-out"),
  DISCONTINUED("discontinued");

  private final String status;
  StockStatus(String status) {
    this.status = status;
  }

  /**
   *
   * @return the JSON string representation of the status
   */
  @JsonValue
  public String status() {
    return status;
  }

}
