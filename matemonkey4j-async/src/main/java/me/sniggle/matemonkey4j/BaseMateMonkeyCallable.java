package me.sniggle.matemonkey4j;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.sniggle.matemonkey4j.api.model.result.DealerResult;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * Created by iulius on 24/10/15.
 */
public abstract class BaseMateMonkeyCallable<V> implements Callable<V> {

  private static final String BASE_URL = "";

  private final ObjectMapper objectMapper = new ObjectMapper();
  private final String path;
  private final Class<V> restCallResult;

  protected BaseMateMonkeyCallable(Class<V> restCallResult, String path) {
    super();
    this.restCallResult = restCallResult;
    this.path = path;
  }

  protected ObjectMapper getObjectMapper() {
    return objectMapper;
  }

  protected String getPath() {
    return path;
  }

  protected InputStream loadUrl(Map<String, String> parameters) throws IOException {
    URL url = new URL(BASE_URL + getPath());
    return url.openStream();
  }

  @Override
  public V call() throws Exception {
    V result = null;
    try( InputStream in = loadUrl(null) ) {
      result = getObjectMapper()
          .readerFor(restCallResult)
          .readValue(in);
    }
    return result;
  }

}
