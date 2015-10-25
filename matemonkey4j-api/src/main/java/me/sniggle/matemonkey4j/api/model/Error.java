package me.sniggle.matemonkey4j.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author tuxbox, sniggle.me
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Error {

  private String title;
  private String[] messages;

  public Error() {
  }

  /**
   *
   * @return the title of the error message
   */
  public String getTitle() {
    return title;
  }

  /**
   *
   * @param title
   *    the title of the error message
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   *
   * @return the error messages
   */
  public String[] getMessages() {
    return messages;
  }

  /**
   *
   * @param messages
   *    the error messages
   */
  public void setMessages(String[] messages) {
    this.messages = messages;
  }
}
