package jp.co.linnefromice.dummyApiApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;

@SpringBootApplication
public class DummyApiAppApplication implements CommandLineRunner {

	@Autowired
	private CacheManager cacheManager;

	public static void main(String[] args) {
		SpringApplication.run(DummyApiAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		cacheManager.init();
		Collection rateList = cacheManager.getRateCache();
		Collection currencyList = cacheManager.getCurrencyCache();

		System.out.println("## Currency ##");
		currencyList.stream().forEach(System.out::println);
		System.out.println("## Rate ##");
		rateList.stream().forEach(System.out::println);
		System.out.println("##########");
		System.out.println("Hello world!");
	}
}
