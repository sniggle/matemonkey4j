package me.sniggle.matemonkey4j;

import me.sniggle.matemonkey4j.dealer.*;
import me.sniggle.matemonkey4j.producer.ProducersCallableTest;
import me.sniggle.matemonkey4j.product.ProductsByProducerCallableTest;
import me.sniggle.matemonkey4j.search.SearchCallable;
import me.sniggle.matemonkey4j.search.SearchCallableTest;
import me.sniggle.matemonkey4j.stock.StockByDealerIdCallableTest;
import me.sniggle.matemonkey4j.stock.UpdateStockForDealerCallableTest;
import org.junit.runners.Suite;

/**
 * Created by iulius on 25/10/15.
 */
@Suite.SuiteClasses({
    CreateDealerCallableTest.class,
    DealerByIdCallableTest.class,
    DealerBySlugCallableTest.class,
    DealerCallableQueryTest.class,
    DealersCallableTest.class,
    UpdateDealerCallableTest.class,
    ProducersCallableTest.class,
    ProductsByProducerCallableTest.class,
    ProducersCallableTest.class,
    SearchCallableTest.class,
    StockByDealerIdCallableTest.class,
    UpdateStockForDealerCallableTest.class
})
public class TestSuite {
}
