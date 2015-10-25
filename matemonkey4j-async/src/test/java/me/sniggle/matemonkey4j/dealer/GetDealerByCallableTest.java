package me.sniggle.matemonkey4j.dealer;

import me.sniggle.matemonkey4j.BaseCallableTest;
import me.sniggle.matemonkey4j.api.model.Address;
import me.sniggle.matemonkey4j.api.model.Dealer;
import me.sniggle.matemonkey4j.api.model.DealerType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by iulius on 25/10/15.
 */
public class GetDealerByCallableTest extends BaseCallableTest {

  public void assertResult(Dealer result) {
    assertNotNull(result);
    assertEquals(2450l, result.getId());
    assertEquals(DealerType.RETAIL, result.getType());
    assertEquals("Getränkemarkt am Isartor", result.getName());
    assertEquals("getraenkemarkt-am-isartor", result.getSlug());
    assertEquals("2015-05-20T09:37:30+00:00", result.getCreatedAt());
    assertEquals("EUR", result.getCurrency());
    assertEquals("Führt auch fritz-kola, Default Mate: Kasten 15.95€ + Pfand 4.50€", result.getNote());
    assertEquals("2015-05-20T23:48:59+00:00", result.getUpdatedAt());
    Address address = result.getAddress();
    assertEquals("+4989220775", address.getPhone());
    assertEquals("",address.getWeb());
    assertNull(address.getEmail());
    assertEquals("80538", address.getPostal());
    assertEquals("Germany", address.getCountry());
    assertEquals("München", address.getCity());
    assertEquals("7", address.getNumber());
    assertEquals("Kanalstr.", address.getStreet());
    assertEquals(48.1351847, address.getLat(), 0.0);
    assertEquals(11.5839644, address.getLon(), 0.0);
  }

}
