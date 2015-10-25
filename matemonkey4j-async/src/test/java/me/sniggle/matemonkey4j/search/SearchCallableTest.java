package me.sniggle.matemonkey4j.search;

import me.sniggle.matemonkey4j.BaseCallableTest;
import me.sniggle.matemonkey4j.api.model.geo.GeoLocation;
import me.sniggle.matemonkey4j.api.query.SearchQueryBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by iulius on 25/10/15.
 */
public class SearchCallableTest extends BaseCallableTest {

  private SearchCallable searchCallable;

  @Before
  public void setup() {
    searchCallable = new SearchCallable(SearchQueryBuilder.create().searchTerm("Köln").build());
    resetBaseUrl(searchCallable);
  }

  @Test
  public void testCall() throws Exception {
    GeoLocation result = searchCallable.call();
    assertNotNull(result);
    assertEquals("GeoLocation", result.getType());
    assertEquals(50.9383611, result.getLat(), 0.0);
    assertEquals(6.9599738, result.getLon(), 0.0);
  }

  public void cleanUp() {
    searchCallable = null;
  }

}
