package me.sniggle.matemonkey4j.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author tuxbox, sniggle.me
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Address {

  private String street;
  private String number;
  private String country;
  private String city;
  private String postal;
  @JsonProperty("lat")
  private double latitude;
  @JsonProperty("lon")
  private double longitude;
  private String web;
  private String email;
  private String phone;

  public Address() {
  }

  /**
   *
   * @return
   */
  public String getStreet() {
    return street;
  }

  /**
   *
   * @param street
   */
  public void setStreet(String street) {
    this.street = street;
  }

  /**
   *
   * @return
   */
  public String getNumber() {
    return number;
  }

  /**
   *
   * @param number
   */
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   *
   * @return
   */
  public String getCountry() {
    return country;
  }

  /**
   *
   * @param country
   */
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   *
   * @return
   */
  public String getCity() {
    return city;
  }

  /**
   *
   * @param city
   */
  public void setCity(String city) {
    this.city = city;
  }

  /**
   *
   * @return
   */
  public String getPostal() {
    return postal;
  }

  /**
   *
   * @param postal
   */
  public void setPostal(String postal) {
    this.postal = postal;
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

  /**
   *
   * @return
   */
  public String getWeb() {
    return web;
  }

  /**
   *
   * @param web
   */
  public void setWeb(String web) {
    this.web = web;
  }

  /**
   *
   * @return
   */
  public String getEmail() {
    return email;
  }

  /**
   *
   * @param email
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   *
   * @return
   */
  public String getPhone() {
    return phone;
  }

  /**
   *
   * @param phone
   */
  public void setPhone(String phone) {
    this.phone = phone;
  }
}
