package me.sniggle.matemonkey4j.dealer;

import me.sniggle.matemonkey4j.BaseMateMonkeyCallable;
import me.sniggle.matemonkey4j.api.model.Dealer;

/**
 * Created by iulius on 25/10/15.
 */
public class DealerBySlugCallable extends BaseMateMonkeyCallable<Void, Dealer> {

  private final String slug;

  public DealerBySlugCallable(String slug) {
    super(Dealer.class, "/dealers/slug/:slug");
    this.slug = slug;
  }

  @Override
  protected String resolvePath() {
    return getPath().replace(":slug", slug);
  }
}
