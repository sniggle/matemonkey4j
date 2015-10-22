package me.sniggle.matemonkey4j.api.model;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by iulius on 22/10/15.
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

  @JsonValue
  public String status() {
    return status;
  }

}
