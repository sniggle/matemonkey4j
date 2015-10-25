package me.sniggle.matemonkey4j.api.query;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by iulius on 25/10/15.
 */
public class SearchQueryBuilder implements Query {

  private String searchTerm;

  public static SearchQueryBuilder create() {
    return new SearchQueryBuilder();
  }

  public SearchQueryBuilder searchTerm(String searchTerm) {
    this.searchTerm = searchTerm;
    return this;
  }

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
