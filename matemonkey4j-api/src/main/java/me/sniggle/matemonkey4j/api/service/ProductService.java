package me.sniggle.matemonkey4j.api.service;

import me.sniggle.matemonkey4j.api.model.Producer;
import me.sniggle.matemonkey4j.api.model.result.ProductResult;

/**
 * Created by iulius on 22/10/15.
 */
public interface ProductService {

  ProductResult getAllProducts();

  ProductResult getProductsBy(Producer producer);

}
