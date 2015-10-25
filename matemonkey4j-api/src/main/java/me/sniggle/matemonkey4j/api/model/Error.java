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
   * @return
   */
  public String getTitle() {
    return title;
  }

  /**
   *
   * @param title
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   *
   * @return
   */
  public String[] getMessages() {
    return messages;
  }

  /**
   *
   * @param messages
   */
  public void setMessages(String[] messages) {
    this.messages = messages;
  }
}
