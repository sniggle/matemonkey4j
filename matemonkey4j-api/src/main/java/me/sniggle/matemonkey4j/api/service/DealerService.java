package me.sniggle.matemonkey4j.api.service;

import me.sniggle.matemonkey4j.api.model.Dealer;
import me.sniggle.matemonkey4j.api.model.result.DealerResult;

/**
 * Created by iulius on 22/10/15.
 */
public interface DealerService {

  DealerResult getAllDealers();

  Dealer getDealerById(long id);

  Dealer getDealerBySlug(String slug);

  boolean createDealer(Dealer dealer);

  boolean updateDealer(Dealer dealer);

}
