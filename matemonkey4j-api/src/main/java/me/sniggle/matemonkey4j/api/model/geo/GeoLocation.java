package me.sniggle.matemonkey4j.api.model.geo;

/**
 * Created by iulius on 23/10/15.
 */
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
