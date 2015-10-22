package me.sniggle.matemonkey4j.api.model;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by iulius on 22/10/15.
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

  @JsonValue
  public String type() {
    return type;
  }

}
