package me.sniggle.matemonkey4j.producer;

import me.sniggle.matemonkey4j.BaseCallableTest;
import me.sniggle.matemonkey4j.api.model.result.ProducerResult;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by iulius on 25/10/15.
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
    assertEquals(22, result.getCount());
    assertNotNull(result.getProducers());
    assertEquals(22, result.getProducers().size());
  }

  @After
  public void cleanUp() {
    producersCallable = null;
  }

}
