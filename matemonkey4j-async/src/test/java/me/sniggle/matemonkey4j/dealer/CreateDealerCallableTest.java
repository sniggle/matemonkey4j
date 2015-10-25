package me.sniggle.matemonkey4j.dealer;

import me.sniggle.matemonkey4j.BaseCallableTest;
import me.sniggle.matemonkey4j.api.model.Address;
import me.sniggle.matemonkey4j.api.model.Dealer;
import me.sniggle.matemonkey4j.api.model.DealerType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by iulius on 25/10/15.
 */
public class CreateDealerCallableTest extends BaseCallableTest {

  private CreateDealerCallable createDealerCallable;

  @Before
  public void setup() {
    Dealer dealer = new Dealer();
    dealer.setType(DealerType.RETAIL);
    dealer.setName("Büdchen met Hätz");
    Address address = new Address();
    address.setPostal("50676");
    address.setStreet("Poststr.");
    address.setCity("Köln");
    address.setCountry("Germany");
    dealer.setAddress(address);
    createDealerCallable = new CreateDealerCallable(dealer);
    resetBaseUrl(createDealerCallable);
  }

  @Test
  public void testCall() throws Exception {
    Dealer result = createDealerCallable.call();
    assertNotNull(result);
  }

  @After
  public void cleanUp() {
    createDealerCallable = null;
  }

}
