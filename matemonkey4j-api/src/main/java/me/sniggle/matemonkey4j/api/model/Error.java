package me.sniggle.matemonkey4j.api.model;

/**
 * Created by iulius on 22/10/15.
 */
public class Error {

  private String title;
  private String[] messages;

  public Error() {
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String[] getMessages() {
    return messages;
  }

  public void setMessages(String[] messages) {
    this.messages = messages;
  }
}
