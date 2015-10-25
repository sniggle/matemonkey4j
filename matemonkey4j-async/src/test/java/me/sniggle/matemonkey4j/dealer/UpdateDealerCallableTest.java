package me.sniggle.matemonkey4j.dealer;

import me.sniggle.matemonkey4j.BaseCallableTest;
import me.sniggle.matemonkey4j.api.model.Address;
import me.sniggle.matemonkey4j.api.model.Dealer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by iulius on 25/10/15.
 */
public class UpdateDealerCallableTest extends BaseCallableTest {

  private UpdateDealerCallable updateDealerCallable;

  @Before
  public void setup() {
    //{"name":"Brausedealer","id":1,"type":"retail","note":"","slug":"brausedealer","created_at":"2015-05-20T09:19:21+00:00","updated_at":"2015-05-20T23:49:17+00:00","address":{"street":"ErderstraÃŸe","number":"33","country":"Germany","city":"Hannover","postal":"30451","lat":52.3761,"lon":9.70221,"web":"","email":null,"phone":""},"currency":"EUR"}
    Dealer dealer = new Dealer();
    dealer.setId(1);
    dealer.setName("Brausedealer - TEST Update");
    Address address = new Address();
    dealer.setAddress(address);
    address.setNumber("33test");
    updateDealerCallable = new UpdateDealerCallable(dealer);
    resetBaseUrl(updateDealerCallable);
  }

  @Test
  public void testCall() throws Exception {
    Dealer dealer = updateDealerCallable.call();
    assertNotNull(dealer);
    assertEquals("Brausedealer - TEST Update", dealer.getName());
    assertNotNull(dealer.getAddress());
    assertEquals("33test", dealer.getAddress().getNumber());
  }

  @After
  public void cleanUp() {
    updateDealerCallable = null;
  }

}
