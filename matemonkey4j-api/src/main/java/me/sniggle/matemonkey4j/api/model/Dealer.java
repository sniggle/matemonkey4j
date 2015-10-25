package me.sniggle.matemonkey4j.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author tuxbox, sniggle.me
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Dealer {

  private long id;
  private String name;
  private DealerType type;
  private String note;
  private String slug;
  private String currency;
  @JsonProperty("created_at")
  private String createdAt;
  @JsonProperty("updated_at")
  private String updatedAt;
  private Address address;

  public Dealer() {
  }

  /**
   *
   * @return the internal ID
   */
  public long getId() {
    return id;
  }

  /**
   *
   * @param id
   *    the internal ID
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   *
   * @return the common name of the dealer
   */
  public String getName() {
    return name;
  }

  /**
   *
   * @param name
   *    the common name of the dealer
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   *
   * @return the type of dealer
   */
  public DealerType getType() {
    return type;
  }

  /**
   *
   * @param type
   *    the type of dealer
   */
  public void setType(DealerType type) {
    this.type = type;
  }

  /**
   *
   * @return a free text note
   */
  public String getNote() {
    return note;
  }

  /**
   *
   * @param note
   *    a free text note
   */
  public void setNote(String note) {
    this.note = note;
  }

  /**
   *
   * @return the slug name
   */
  public String getSlug() {
    return slug;
  }

  /**
   *
   * @param slug
   *    the slug name
   */
  public void setSlug(String slug) {
    this.slug = slug;
  }

  /**
   *
   * @return the accepted currency
   */
  public String getCurrency() {
    return currency;
  }

  /**
   *
   * @param currency
   *    the accepted currency
   */
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   *
   * @return the ISO 8601 formatted timestamp of dealer's entry creation
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   *
   * @param createdAt
   *    the ISO 8601 formatted timestamp of dealer's entry creation
   */
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   *
   * @return the ISO 8601 formatted timestamp of last entry's update
   */
  public String getUpdatedAt() {
    return updatedAt;
  }

  /**
   *
   * @param updatedAt
   *    the ISO 8601 formatted timestamp of last entry's update
   */
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   *
   * @return the address of the dealer
   */
  public Address getAddress() {
    return address;
  }

  /**
   *
   * @param address
   *    the address of the dealer
   */
  public void setAddress(Address address) {
    this.address = address;
  }

}
