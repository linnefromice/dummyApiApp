package jp.co.linnefromice.dummyApiApp;

import jp.co.linnefromice.dummyApiApp.domain.Currency;
import jp.co.linnefromice.dummyApiApp.domain.CurrencyPair;
import jp.co.linnefromice.dummyApiApp.domain.Rate;
import jp.co.linnefromice.dummyApiApp.service.CurrencyPairService;
import jp.co.linnefromice.dummyApiApp.service.CurrencyService;
import jp.co.linnefromice.dummyApiApp.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class CacheManager {

    public static ConcurrentHashMap<String, Currency> currencyCacheMap;

    public static ConcurrentHashMap<String, CurrencyPair> currencyPairCacheMap;

    public static ConcurrentHashMap<String, Rate> latestRateCacheMap;

    @Autowired
    private CurrencyService currencyService;
    @Autowired
    private CurrencyPairService currencyPairService;
    @Autowired
    private RateService rateService;

    private CacheManager() {
        currencyCacheMap = new ConcurrentHashMap<String, Currency>();
        currencyPairCacheMap = new ConcurrentHashMap<String, CurrencyPair>();
        latestRateCacheMap = new ConcurrentHashMap<String, Rate>();
    }

    @PostConstruct
    private void init() {
        System.out.println("■■ CacheManager 初期化 ■■");
        currencyService.findAll().forEach(currency -> currencyCacheMap.put(currency.getCurrencyCode(), currency));
        currencyPairService.findAll().forEach(currencyPair -> currencyPairCacheMap.put(currencyPair.getCurrencyPairCode(), currencyPair));
        rateService.findAll().forEach(rate -> latestRateCacheMap.put(rate.getCurrencyPairCode(), rate));
        System.out.println("■■ CacheManager 初期化終了 ■■");
    }
}
