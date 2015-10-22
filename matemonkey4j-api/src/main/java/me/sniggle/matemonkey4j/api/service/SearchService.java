package me.sniggle.matemonkey4j.api.service;

import me.sniggle.matemonkey4j.api.model.geo.GeoLocation;
import me.sniggle.matemonkey4j.api.model.result.DealerResult;
import me.sniggle.matemonkey4j.api.query.Query;

/**
 * Created by iulius on 23/10/15.
 */
public interface SearchService {

  GeoLocation findLocation(String city);
  GeoLocation findLocation(Query query);

  DealerResult findDealersBy(Query query);

}
