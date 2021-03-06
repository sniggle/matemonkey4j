package me.sniggle.matemonkey4j.producer;

import me.sniggle.matemonkey4j.BaseCallableTest;
import me.sniggle.matemonkey4j.api.model.result.ProducerResult;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author tuxbox, sniggle.me
 */
public class ProducersCallableTest extends BaseCallableTest {

  private ProducersCallable producersCallable;

  @Before
  public void setup() {
    producersCallable = new ProducersCallable();
    resetBaseUrl(producersCallable);
  }

  @Test
  public void testCall() throws Exception {
    ProducerResult result = producersCallable.call();
    assertNotNull(result);
    assertTrue(result.getCount() >= 17);
    assertNotNull(result.getProducers());
    assertTrue(result.getProducers().size() >= 17);
    assertEquals(result.getCount(), result.getProducers().size());
  }

  @After
  public void cleanUp() {
    producersCallable = null;
  }

}
