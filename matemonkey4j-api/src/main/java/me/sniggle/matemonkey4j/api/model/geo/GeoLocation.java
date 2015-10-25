package me.sniggle.matemonkey4j.api.model.geo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author tuxbox, sniggle.me
 *
 * The result of a MateMonkey API search query
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GeoLocation {

  private String type;
  @JsonProperty("lat")
  private double latitude;
  @JsonProperty("lon")
  private double longitude;

  public GeoLocation() {
  }

  /**
   *
   * @return
   */
  public String getType() {
    return type;
  }

  /**
   *
   * @param type
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   *
   * @return
   */
  public double getLatitude() {
    return latitude;
  }

  /**
   *
   * @param latitude
   */
  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  /**
   *
   * @return
   */
  public double getLongitude() {
    return longitude;
  }

  /**
   *
   * @param longitude
   */
  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }
}
