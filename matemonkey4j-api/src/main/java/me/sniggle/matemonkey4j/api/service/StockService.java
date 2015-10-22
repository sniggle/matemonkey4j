package me.sniggle.matemonkey4j.api.service;

import me.sniggle.matemonkey4j.api.model.Dealer;
import me.sniggle.matemonkey4j.api.model.StockEntry;
import me.sniggle.matemonkey4j.api.model.result.StockEntryResult;

/**
 * Created by iulius on 22/10/15.
 */
public interface StockService {

  StockEntryResult getStockForDealer(Dealer dealer);

  StockEntryResult getStockForDealer(long dealerId);

  boolean updateStockEntry(Dealer dealer, StockEntry stockEntry);

  boolean updateStockEntry(long dealerId, StockEntry stockEntry);

}
