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
   * @return the street name of the address
   */
  public String getStreet() {
    return street;
  }

  /**
   *
   * @param street
   *    the street name of the address
   */
  public void setStreet(String street) {
    this.street = street;
  }

  /**
   *
   * @return the house number
   */
  public String getNumber() {
    return number;
  }

  /**
   *
   * @param number
   *    the house number
   */
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   *
   * @return the country's name
   */
  public String getCountry() {
    return country;
  }

  /**
   *
   * @param country
   *    the country's name
   */
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   *
   * @return the city
   */
  public String getCity() {
    return city;
  }

  /**
   *
   * @param city
   *    the city
   */
  public void setCity(String city) {
    this.city = city;
  }

  /**
   *
   * @return the zip code
   */
  public String getPostal() {
    return postal;
  }

  /**
   *
   * @param postal
   *    the zip code
   */
  public void setPostal(String postal) {
    this.postal = postal;
  }

  /**
   *
   * @return the latitude of the address
   */
  public double getLatitude() {
    return latitude;
  }

  /**
   *
   * @param latitude
   *    the latitude of the address
   */
  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  /**
   *
   * @return the longitude of the address
   */
  public double getLongitude() {
    return longitude;
  }

  /**
   *
   * @param longitude
   *    the longitude of the address
   */
  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  /**
   *
   * @return the website url
   */
  public String getWeb() {
    return web;
  }

  /**
   *
   * @param web
   *    the website url
   */
  public void setWeb(String web) {
    this.web = web;
  }

  /**
   *
   * @return the email address
   */
  public String getEmail() {
    return email;
  }

  /**
   *
   * @param email
   *    the email address
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   *
   * @return the phone number
   */
  public String getPhone() {
    return phone;
  }

  /**
   *
   * @param phone
   *    the phone number
   */
  public void setPhone(String phone) {
    this.phone = phone;
  }
}
