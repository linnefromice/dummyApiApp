package jp.co.linnefromice.dummyApiApp;

import jp.co.linnefromice.dummyApiApp.domain.Currency;
import jp.co.linnefromice.dummyApiApp.domain.Rate;
import jp.co.linnefromice.dummyApiApp.service.CurrencyService;
import jp.co.linnefromice.dummyApiApp.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class CacheManager {

    // Cache
    /* レート情報のMap(toCurrencyCode, Rate) */
    private ConcurrentHashMap rateMap = new ConcurrentHashMap<String, Rate>();
    /* レート情報のMap(currencyCode, Currency) */
    private ConcurrentHashMap currencyMap = new ConcurrentHashMap<String, Currency>();
    /* レート情報のMap(Currency, Rate) */
    private ConcurrentHashMap latestRateMap = new ConcurrentHashMap<Currency, Rate>();

    @Autowired
    private RateService rateService;
    @Autowired
    private CurrencyService currencyService;

    @PostConstruct
    public void init() {

        // findAll
        List<Rate> rateList = rateService.findAll();
        List<Currency> currencyList = currencyService.findAll();

        // create cache
        rateList.stream().forEach(rate -> rateMap.put(rate.getToCurrencyCode(), rate));
        currencyList.stream().forEach(currency -> currencyMap.put(currency.getCurrencyCode(), currency));
        // TODO: 初期化 latestRateMap
        // currencyList.stream().forEach(currency -> latestRateMap.put(currency, this.getRateByToCurrencyCode(currency.getCurrencyCode())));
    }

    public ConcurrentHashMap getRateMap() {
        return this.rateMap;
    }

    public Collection getRateCacheValues() {
        return rateMap.values();
    }

    public Rate getRateByToCurrencyCode(String toCurrencyCode) {
        return (Rate)this.rateMap.get(toCurrencyCode);
    }

    public ConcurrentHashMap getCurrencyMap() {
        return this.currencyMap;
    }

    public Collection getCurrencyCacheValues() {
        return currencyMap.values();
    }

    public Currency getCurrencyByCurrencyCode(String currencyCode) {
        return (Currency)this.currencyMap.get(currencyCode);
    }

    public ConcurrentHashMap getLatestRateMap() {
        return this.latestRateMap;
    }

    public Collection getLatestRateValues() {
        return currencyMap.values();
    }

    public Rate getLatestRateByCurrency(Currency currency) {
        return (Rate)this.latestRateMap.get(currency);
    }
}
