package me.sniggle.matemonkey4j.api.model.result;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by iulius on 22/10/15.
 */
public abstract class BaseAPIResultBindingTest<T> {

  private final String resourcePath;
  private T resultType;
  private final Class<T> resultClass;

  protected BaseAPIResultBindingTest(Class<T> resultClass, String resourcePath) {
    this.resultClass = resultClass;
    this.resourcePath = resourcePath;
  }

  @Before
  public void setup() {
    ObjectMapper objectMapper = new ObjectMapper();
    try( InputStream inputStream = getClass().getResourceAsStream(resourcePath) ) {
      resultType = objectMapper
          .reader()
          .forType(resultClass)
          .readValue(inputStream);
    } catch (IOException e) {
      e.printStackTrace();
      resultType = null;
    }
  }

  public T getResultType() {
    return resultType;
  }

}
