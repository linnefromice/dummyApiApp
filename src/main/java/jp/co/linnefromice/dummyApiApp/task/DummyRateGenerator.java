package jp.co.linnefromice.dummyApiApp.task;

import jp.co.linnefromice.dummyApiApp.CacheManager;
import jp.co.linnefromice.dummyApiApp.domain.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.Date;

@Component
public class DummyRateGenerator {

    @Autowired
    private CacheManager cacheManager;

    @Scheduled(fixedDelay = 2500)
    public void generateRates() {
        System.out.println("## generateRates :"+new Date().toString()+" ##");
        final String testCurrencyPairCode = "BTC/JPY";
        Rate beforeRate = CacheManager.latestRateCacheMap.get(testCurrencyPairCode);
        if (StringUtils.isEmpty(beforeRate)) {
            return;
        }
        Rate newRate = new Rate();
        String nextId = String.valueOf(Integer.parseInt(beforeRate.getId()) + 1);
        newRate.setId(nextId);
        newRate.setCurrencyPairCode(beforeRate.getCurrencyPairCode());
        newRate.setMarketRate(beforeRate.getMarketRate().multiply(new BigDecimal(Math.random())));
        newRate.setGeneratedTime(new Date());
        CacheManager.latestRateCacheMap.replace(testCurrencyPairCode, newRate);

        System.out.println("TEST Cache Confirm");
        CacheManager.latestRateCacheMap.values().forEach(System.out::println);
        System.out.println("TEST finish");
        System.out.println("## finish :"+new Date().toString()+" ##");


        /*
        currencies.stream().map(currency -> {
            Rate beforeRate = (Rate)latestRateMap.get(currency);
            if(StringUtils.isEmpty(beforeRate)) {
                return null;
            }

            Rate newRate = new Rate();
            newRate.setId(beforeRate.getId());
            newRate.setFromCurrencyCode(beforeRate.getFromCurrencyCode());
            newRate.setToCurrencyCode(beforeRate.getToCurrencyCode());
            newRate.setMarketRate(beforeRate.getMarketRate().multiply(new BigDecimal(Math.random())));
            newRate.setGeneratedTime((Date)generatedTime.clone());
            Currency newCurrency = (Currency) currency;
            cacheManager.replaceLatestRate(newCurrency, newRate);
            return null;
        });
        */

    }


}
