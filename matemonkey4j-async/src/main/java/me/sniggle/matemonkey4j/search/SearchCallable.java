package me.sniggle.matemonkey4j.search;

import me.sniggle.matemonkey4j.BaseMateMonkeyCallable;
import me.sniggle.matemonkey4j.api.model.geo.GeoLocation;
import me.sniggle.matemonkey4j.api.query.Query;

import java.util.Map;

/**
 * Created by iulius on 25/10/15.
 */
public class SearchCallable extends BaseMateMonkeyCallable<Void, GeoLocation> {

  private final Query query;

  public SearchCallable(Query query) {
    super(GeoLocation.class, "/search");
    this.query = query;
  }

  @Override
  protected String resolvePath() {
    if( query == null || query.toQuery() == null ) {
      throw new IllegalArgumentException("A query must be provided for the search functionality");
    }
    return getPath() + "?" + query.toQuery();
  }
}
