package jp.co.linnefromice.dummyApiApp.task;

import jp.co.linnefromice.dummyApiApp.CacheManager;
import jp.co.linnefromice.dummyApiApp.domain.Rate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class DummyRateGenerator {

    @Autowired
    private CacheManager cacheManager;

    @Scheduled(fixedDelay = 5000)
    public void generateRates() {
        System.out.println("## generateRates :"+new Date().toString()+" ##");
        Collection currencies = cacheManager.getCurrencyCacheValues();
        System.out.println("Currencys: "+currencies.toString());
        // TODO: レート自動生成
        /*
        ConcurrentHashMap latestRateMap = cacheManager.getLatestRateMap();
        Date generatedTime = new Date();

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
            return latestRateMap.replace(currency, newRate);
        });

        System.out.println("TEST Cache Confirm");

        cacheManager.getLatestRateValues().stream().forEach(System.out::println);
        System.out.println("TEST finish");
        */
        System.out.println("## finish :"+new Date().toString()+" ##");
    }
}
