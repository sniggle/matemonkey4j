package me.sniggle.matemonkey4j.api.query;

import me.sniggle.matemonkey4j.api.model.DealerType;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by iulius on 25/10/15.
 */
public final class DealerQueryBuilder implements Query {

  private class BBox implements Query {

    private final double latitudeLeft;
    private final double latitudeRight;
    private final double longitudeTop;
    private final double longitudeBottom;

    public BBox(double latitudeLeft, double latitudeRight, double longitudeTop, double longitudeBottom) {
      this.latitudeLeft = latitudeLeft;
      this.latitudeRight = latitudeRight;
      this.longitudeTop = longitudeTop;
      this.longitudeBottom = longitudeBottom;
    }

    @Override
    public String toQuery() {
      return "bbox=" + latitudeLeft + "," + longitudeBottom + "," + latitudeRight + "," + longitudeTop;
    }

  }

  private BBox bbox = null;
  private final Set<DealerType> dealerTypes = new HashSet<>();
  private final Set<String> productIds = new HashSet<>();


  private DealerQueryBuilder() {
    super();
  }

  public static DealerQueryBuilder create() {
    return new DealerQueryBuilder();
  }

  public DealerQueryBuilder bbox(double latitudeLeft, double longitudeBottom, double latitudeRight, double longitudeTop) {
    if( latitudeLeft > 90.0 || latitudeLeft < -90.0 || latitudeRight > 90.0 || latitudeRight < -90.0 ) {
      throw new IllegalArgumentException("Latitudes must be between -90.0 <= latitude <= 90.0, but was latitudeLeft: " + latitudeLeft + " and latitudeRight: " + latitudeRight);
    }
    if( longitudeBottom > 180.0 || longitudeBottom < -180.0 || longitudeTop > 180.0 || longitudeTop < -180.0 ) {
      throw new IllegalArgumentException("Longitudes must be between -180.0 <= longitude <= 180.0, but was longitudeTop: " + longitudeTop + " and longitudeBottom: " + longitudeBottom);
    }
    bbox = new BBox(latitudeLeft, latitudeRight, longitudeTop, longitudeBottom);
    return this;
  }

  public DealerQueryBuilder addDealerType(DealerType dealerType) {
    if( dealerType != null ) {
      dealerTypes.add(dealerType);
    }
    return this;
  }

  public DealerQueryBuilder addProductId(String productId) {
    if( productId != null && !productId.trim().isEmpty()) {
      productIds.add(productId);
    }
    return this;
  }

  public Query build() {
    return this;
  }

  @Override
  public String toQuery() {
    StringBuilder stringBuilder = new StringBuilder();
    if( bbox != null ) {
      stringBuilder.append(bbox.toQuery());
    }
    if( stringBuilder.length() > 0 ) {
      stringBuilder.append('&');
    }
    if( !dealerTypes.isEmpty() ) {
      StringBuilder builder = new StringBuilder("type=");
      for( DealerType dealerType : dealerTypes ) {
        builder.append(dealerType.type());
        builder.append(',');
      }
      builder.setLength(builder.length()-1);
      stringBuilder.append(builder);
    }
    if( stringBuilder.length() > 0 ) {
      stringBuilder.append('&');
    }
    if( !productIds.isEmpty() ) {
      StringBuilder builder = new StringBuilder("product=");
      for( String productId : productIds ) {
        builder.append(productId);
        builder.append(',');
      }
      builder.setLength(builder.length() - 1);
      stringBuilder.append(builder);
    }
    return stringBuilder.length() == 0 ? null : stringBuilder.toString();
  }
}
