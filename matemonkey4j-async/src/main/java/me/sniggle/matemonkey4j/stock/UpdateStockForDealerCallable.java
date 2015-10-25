package me.sniggle.matemonkey4j.stock;

import me.sniggle.matemonkey4j.BaseMateMonkeyCreateCallable;
import me.sniggle.matemonkey4j.api.model.Dealer;
import me.sniggle.matemonkey4j.api.model.StockEntry;
import me.sniggle.matemonkey4j.api.model.StockUpdate;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/**
 * @author tuxbox, sniggle.me
 */
public class UpdateStockForDealerCallable extends BaseMateMonkeyCreateCallable<StockUpdate, Void> {

  private final StockUpdate stockUpdate;
  private final Dealer dealer;

  /**
   *
   * @param dealer
   * @param stockUpdate
   */
  public UpdateStockForDealerCallable(Dealer dealer, StockUpdate stockUpdate) {
    super(Void.class, "/dealers/:id/stock");
    this.dealer = dealer;
    this.stockUpdate = stockUpdate;
  }

  @Override
  protected void validateBody(StockUpdate stockUpdate) throws IOException {
    if( dealer == null ) {
      throw new IOException("A dealer must be provided");
    }
    if( stockUpdate == null ) {
      throw new IOException("A stock update must be provided");
    }
    if( stockUpdate.getProductId() <= 0 ) {
      throw new IOException("The product id to update must be greater 0");
    }
  }

  @Override
  protected String resolvePath() {
    return getPath().replace(":id", String.valueOf(dealer.getId()));
  }

  @Override
  protected StockUpdate getBody() {
    return stockUpdate;
  }

  @Override
  protected URLConnection prepareCall(StockUpdate stockUpdate) throws IOException {
    HttpURLConnection connection = (HttpURLConnection) super.prepareCall(stockUpdate);
    getObjectMapper()
        .writer()
        .writeValue(connection.getOutputStream(), stockUpdate);
    return connection;
  }
}
