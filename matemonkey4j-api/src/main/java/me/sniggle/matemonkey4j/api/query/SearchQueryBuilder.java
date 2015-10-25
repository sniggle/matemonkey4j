package me.sniggle.matemonkey4j.api.query;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @author tuxbox, sniggle.me
 */
public class SearchQueryBuilder implements Query {

  private String searchTerm;

  /**
   *
   * @return
   */
  public static SearchQueryBuilder create() {
    return new SearchQueryBuilder();
  }

  /**
   *
   * @param searchTerm
   * @return
   */
  public SearchQueryBuilder searchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
    return this;
  }

  /**
   *
   * @return
   */
  public Query build() {
    return this;
  }

  @Override
  public String toQuery() {
    String result = null;
    try {
      result = "query=" + URLEncoder.encode(searchTerm, "UTF-8");
    } catch (UnsupportedEncodingException e) {
    }
    return result;
  }
}
