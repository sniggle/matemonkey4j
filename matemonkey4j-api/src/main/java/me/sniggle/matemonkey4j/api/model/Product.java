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
   * @return the internal ID
   */
  public String getId() {
    return id;
  }

  /**
   *
   * @param id
   *    the internal ID
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   *
   * @return the product name
   */
  public String getName() {
    return name;
  }

  /**
   *
   * @param name
   *    the product name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   *
   * @return the product description
   */
  public String getDescription() {
    return description;
  }

  /**
   *
   * @param description
   *    the product description
   */
  public void setDescription(String description) {
    this.description = description;
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
   * @return the product type
   */
  public ProductType getType() {
    return type;
  }

  /**
   *
   * @param type
   *    the product type
   */
  public void setType(ProductType type) {
    this.type = type;
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
   * @return the producer of the product
   */
  public Producer getProducer() {
    return producer;
  }

  /**
   *
   * @param producer
   *    the producer of the product
   */
  public void setProducer(Producer producer) {
    this.producer = producer;
  }
}
