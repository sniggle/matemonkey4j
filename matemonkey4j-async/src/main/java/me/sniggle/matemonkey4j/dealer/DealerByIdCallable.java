package me.sniggle.matemonkey4j.dealer;

import me.sniggle.matemonkey4j.BaseMateMonkeyCallable;
import me.sniggle.matemonkey4j.api.model.Dealer;

/**
 * @author tuxbox, sniggle.me
 */
public class DealerByIdCallable extends BaseMateMonkeyCallable<Void, Dealer> {

  private final long id;

  /**
   *
   * @param id
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
