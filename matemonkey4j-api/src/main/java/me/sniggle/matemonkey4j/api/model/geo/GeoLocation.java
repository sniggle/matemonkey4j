package me.sniggle.matemonkey4j.api.model.geo;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by iulius on 23/10/15.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GeoLocation {

  private String type;
  private double lat;
  private double lon;

  public GeoLocation() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double getLat() {
    return lat;
  }

  public void setLat(double lat) {
    this.lat = lat;
  }

  public double getLon() {
    return lon;
  }

  public void setLon(double lon) {
    this.lon = lon;
  }
}
