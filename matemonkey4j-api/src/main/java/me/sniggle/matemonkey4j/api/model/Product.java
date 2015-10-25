package me.sniggle.matemonkey4j.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author tuxbox, sniggle.me
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Product {

  private String id;
  private String name;
  private String description;
  private String slug;
  private ProductType type;
  private String image;
  private Producer producer;

  public Product() {
  }

  /**
   *
   * @return
   */
  public String getId() {
    return id;
  }

  /**
   *
   * @param id
   */
  public void setId(String id) {
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
  public ProductType getType() {
    return type;
  }

  /**
   *
   * @param type
   */
  public void setType(ProductType type) {
    this.type = type;
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
  public Producer getProducer() {
    return producer;
  }

  /**
   *
   * @param producer
   */
  public void setProducer(Producer producer) {
    this.producer = producer;
  }
}
