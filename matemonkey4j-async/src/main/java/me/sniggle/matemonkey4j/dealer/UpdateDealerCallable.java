package me.sniggle.matemonkey4j.dealer;

import me.sniggle.matemonkey4j.BaseMateMonkeyUpdateCallable;
import me.sniggle.matemonkey4j.api.model.Dealer;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/**
 * @author tuxbox, sniggle.me
 */
public class UpdateDealerCallable extends BaseMateMonkeyUpdateCallable<Dealer, Dealer> {

  private final Dealer dealer;

  /**
   *
   * @param dealer
   */
  public UpdateDealerCallable(Dealer dealer) {
    super(Dealer.class, "/dealers/:id");
    this.dealer = dealer;
  }

  @Override
  protected Dealer getBody() {
    return dealer;
  }

  @Override
  protected void validateBody(Dealer dealer) throws IOException {
    if( dealer != null ) {
      if( dealer.getId() <= 0 ) {
        throw new IOException("Dealer ID must be greater than 0");
      }
    } else {
      throw new IOException("Missing dealer information! Dealer must be set!");
    }
  }

  @Override
  protected String resolvePath() {
    return getPath().replace(":id", String.valueOf(dealer.getId()));
  }

  @Override
  protected URLConnection prepareCall(Dealer dealer) throws IOException {
    HttpURLConnection connection = (HttpURLConnection)super.prepareCall(dealer);
    getObjectMapper()
        .writer()
        .writeValue(connection.getOutputStream(), dealer);
    return connection;
  }
}
