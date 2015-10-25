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
   * @return the name of the producer
   */
  public String getName() {
    return name;
  }

  /**
   *
   * @param name
   *    the name of the producer
   */
  public void setName(String name) {
    this.name = name;
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
   * @return the image url
   */
  public String getImage() {
    return image;
  }

  /**
   *
   * @param image
   *    the image url
   */
  public void setImage(String image) {
    this.image = image;
  }

  /**
   *
   * @return the description of the producer
   */
  public String getDescription() {
    return description;
  }

  /**
   *
   * @param description
   *    the description of the producer
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   *
   * @return the address of the producer
   */
  public Address getAddress() {
    return address;
  }

  /**
   *
   * @param address
   *    the address of the producer
   */
  public void setAddress(Address address) {
    this.address = address;
  }
}
