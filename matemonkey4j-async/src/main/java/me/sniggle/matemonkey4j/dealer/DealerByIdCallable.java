package me.sniggle.matemonkey4j.dealer;

import me.sniggle.matemonkey4j.BaseMateMonkeyCallable;
import me.sniggle.matemonkey4j.api.model.Dealer;

/**
 * @author tuxbox, sniggle.me
 *
 * Callable used to query for a specific Dealer
 */
public class DealerByIdCallable extends BaseMateMonkeyCallable<Void, Dealer> {

  private final long id;

  /**
   *
   * @param id
   *    the ID of the dealer to query for
   */
  public DealerByIdCallable(long id) {
    super(Dealer.class, "/dealers/:id");
    this.id = id;
  }

  @Override
  protected String resolvePath() {
    return getPath().replace(":id", String.valueOf(id));
  }

}
