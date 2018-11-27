package jp.co.linnefromice.dummyApiApp;

import jp.co.linnefromice.dummyApiApp.domain.Currency;
import jp.co.linnefromice.dummyApiApp.domain.Rate;
import jp.co.linnefromice.dummyApiApp.service.CurrencyService;
import jp.co.linnefromice.dummyApiApp.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class CacheManager {

    // Cache
    private ConcurrentHashMap latestRateMap = new ConcurrentHashMap<String, Rate>();
    private ConcurrentHashMap currencyMap = new ConcurrentHashMap<String, Currency>();

    @Autowired
    private RateService rateService;
    @Autowired
    private CurrencyService currencyService;

    public void init() {

        // findAll
        List<Rate> rateList = rateService.findAll();
        List<Currency> currencyList = currencyService.findAll();

        // create cache
        rateList.stream().forEach(rate -> latestRateMap.put(rate.getId(), rate));
        rateList.stream().forEach(currency -> currencyMap.put(currency.getId(), currency));
    }

    public Collection getRateCache() {
        return latestRateMap.values();
    }

    public Collection getCurrencyCache() {
        return currencyMap.values();
    }
}
