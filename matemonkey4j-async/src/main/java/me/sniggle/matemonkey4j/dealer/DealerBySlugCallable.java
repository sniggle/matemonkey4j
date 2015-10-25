package me.sniggle.matemonkey4j.dealer;

import me.sniggle.matemonkey4j.BaseMateMonkeyCallable;
import me.sniggle.matemonkey4j.api.model.Dealer;

/**
 * @author tuxbox, sniggle.me
 *
 * Callable to query for a specific dealer by slug
 */
public class DealerBySlugCallable extends BaseMateMonkeyCallable<Void, Dealer> {

  private final String slug;

  /**
   *
   * @param slug
   *    the slug name
   */
  public DealerBySlugCallable(String slug) {
    super(Dealer.class, "/dealers/slug/:slug");
    this.slug = slug;
  }

  @Override
  protected String resolvePath() {
    return getPath().replace(":slug", slug);
  }
}
