package jp.co.linnefromice.dummyApiApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DummyApiAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DummyApiAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		System.out.println("## Currency ##");
		CacheManager.currencyCacheMap.values().stream().forEach(System.out::println);
		System.out.println("## CurrencyPair ##");
		CacheManager.currencyPairCacheMap.values().stream().forEach(System.out::println);
		System.out.println("## Rate ##");
		CacheManager.latestRateCacheMap.values().stream().forEach(System.out::println);

		System.out.println("Hello world!");
	}

	/*
	public void test1() {
		System.out.println("### START ###");

		Collection rateList = cacheManagerBk.getRateCacheValues();
		Collection currencyList = cacheManagerBk.getCurrencyCacheValues();
		Collection latestRateList = cacheManagerBk.getLatestRateValues();

		System.out.println("## Currency ##");
		currencyList.stream().forEach(System.out::println);
		System.out.println("## Rate ##");
		rateList.stream().forEach(System.out::println);
		System.out.println("## LatestRate ##");
		latestRateList.stream().forEach(System.out::println);
		System.out.println("##########");
		System.out.println("Hello world!");
	}
*/
}
