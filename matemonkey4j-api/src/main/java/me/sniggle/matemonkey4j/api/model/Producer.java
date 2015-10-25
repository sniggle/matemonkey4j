package me.sniggle.matemonkey4j.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author tuxbox, sniggle.me
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Producer {

  private long id;
  private String name;
  private String slug;
  private String image;
  private String description;
  private Address address;

  public Producer() {
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
  public String getImage() {
    return image;
  }

  /**
   *
   * @param image
   */
  public void setImage(String image) {
    this.image = image;
  }

  /**
   *
   * @return
   */
  public String getDescription() {
    return description;
  }

  /**
   *
   * @param description
   */
  public void setDescription(String description) {
    this.description = description;
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
