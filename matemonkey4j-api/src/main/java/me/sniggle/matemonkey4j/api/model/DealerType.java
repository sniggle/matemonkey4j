package me.sniggle.matemonkey4j.api.model;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author tuxbox, sniggle.me
 */
public enum DealerType {
  BAR("bar"),
  CLUB("club"),
  RETAIL("retail"),
  RESTAURANT("restaurant"),
  OTHER("other"),
  HACKERSPACE("hackerspace"),
  COMMUNITY("community");

  private final String type;
  DealerType(String type) {
    this.type = type;
  }

  /**
   *
   * @return
   */
  @JsonValue
  public String type() {
    return type;
  }

}
