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
   * @return the type of the search result ("GeoLocation")
   */
  public String getType() {
    return type;
  }

  /**
   *
   * @param type
   *    the type of the search result
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   *
   * @return the latitude of the GeoLocation
   */
  public double getLatitude() {
    return latitude;
  }

  /**
   *
   * @param latitude
   *    the latitude of the GeoLocation
   */
  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  /**
   *
   * @return the longitude of the GeoLocation
   */
  public double getLongitude() {
    return longitude;
  }

  /**
   *
   * @param longitude
   *    the longitude of the GeoLocation
   */
  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }
}
