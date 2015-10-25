package me.sniggle.matemonkey4j.dealer;

import me.sniggle.matemonkey4j.BaseMateMonkeyCreateCallable;
import me.sniggle.matemonkey4j.api.model.Address;
import me.sniggle.matemonkey4j.api.model.Dealer;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/**
 * @author tuxbox, sniggle.me
 */
public class CreateDealerCallable extends BaseMateMonkeyCreateCallable<Dealer, Dealer> {

  private Dealer dealer;

  /**
   *
   * @param dealer
   */
  public CreateDealerCallable(Dealer dealer) {
    super(Dealer.class, "/dealers");
    this.dealer = dealer;
  }

  @Override
  protected Dealer getBody() {
    return dealer;
  }

  @Override
  protected void validateBody(Dealer dealer) throws IOException {
    if( dealer != null ) {
      if( dealer.getType() == null || dealer.getName() == null || dealer.getAddress() == null ) {
        throw new IOException("Missing dealer information! Type, name and address must be set!");
      }
      Address address = dealer.getAddress();
      if( address.getPostal()==null || address.getStreet() == null || address.getCity() == null || address.getCountry() == null ) {
        throw new IOException("Missing address information! Postal, street, city and country must be set!");
      }
    } else {
      throw new IOException("Valdation failed! Dealer must be set!");
    }
  }

  @Override
  protected boolean processCall(URLConnection connection) throws IOException {
    return ((HttpURLConnection)connection).getResponseCode() == 201;
  }

  @Override
  protected URLConnection prepareCall(Dealer body) throws IOException {
    HttpURLConnection connection = (HttpURLConnection)super.prepareCall(dealer);
    getObjectMapper()
        .writer()
        .writeValue(connection.getOutputStream(), dealer);
    return connection;
  }

}
