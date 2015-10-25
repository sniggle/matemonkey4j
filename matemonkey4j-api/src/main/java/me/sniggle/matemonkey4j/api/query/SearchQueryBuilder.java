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
   * @return a query builder instance
   */
  public static SearchQueryBuilder create() {
    return new SearchQueryBuilder();
  }

  /**
   *
   * @param searchTerm
   *    the search term to look up
   * @return the query builder instance
   */
  public SearchQueryBuilder searchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
    return this;
  }

  /**
   *
   * @return the query to apply
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
