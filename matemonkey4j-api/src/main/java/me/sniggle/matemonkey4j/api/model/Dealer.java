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
   * @return
   */
  public long getId() {
    return id;
  }

  /**
   *
   * @param id
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   *
   * @return
   */
  public String getName() {
    return name;
  }

  /**
   *
   * @param name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   *
   * @return
   */
  public DealerType getType() {
    return type;
  }

  /**
   *
   * @param type
   */
  public void setType(DealerType type) {
    this.type = type;
  }

  /**
   *
   * @return
   */
  public String getNote() {
    return note;
  }

  /**
   *
   * @param note
   */
  public void setNote(String note) {
    this.note = note;
  }

  /**
   *
   * @return
   */
  public String getSlug() {
    return slug;
  }

  /**
   *
   * @param slug
   */
  public void setSlug(String slug) {
    this.slug = slug;
  }

  /**
   *
   * @return
   */
  public String getCurrency() {
    return currency;
  }

  /**
   *
   * @param currency
   */
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   *
   * @return
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   *
   * @param createdAt
   */
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   *
   * @return
   */
  public String getUpdatedAt() {
    return updatedAt;
  }

  /**
   *
   * @param updatedAt
   */
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   *
   * @return
   */
  public Address getAddress() {
    return address;
  }

  /**
   *
   * @param address
   */
  public void setAddress(Address address) {
    this.address = address;
  }

}
