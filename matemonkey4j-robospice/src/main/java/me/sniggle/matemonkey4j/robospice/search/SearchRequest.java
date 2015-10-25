package me.sniggle.matemonkey4j.robospice.search;

import me.sniggle.matemonkey4j.api.model.geo.GeoLocation;
import me.sniggle.matemonkey4j.api.query.Query;
import me.sniggle.matemonkey4j.robospice.BaseMateMonkeyRequest;
import me.sniggle.matemonkey4j.search.SearchCallable;

/**
 * @author tuxbox, sniggle.me
 *
 * Request wrapper for SearchCallable
 */
public class SearchRequest extends BaseMateMonkeyRequest<GeoLocation> {

  /**
   *
   * @param query
   *    the search query to apply
   */
  public SearchRequest(Query query) {
    super(GeoLocation.class, new SearchCallable(query));
  }

}
