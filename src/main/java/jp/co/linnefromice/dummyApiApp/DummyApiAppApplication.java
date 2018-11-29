package jp.co.linnefromice.dummyApiApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Collection;

@SpringBootApplication
@EnableScheduling
public class DummyApiAppApplication implements CommandLineRunner {

	@Autowired
	private CacheManager cacheManager;

	public static void main(String[] args) {
		SpringApplication.run(DummyApiAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		System.out.println("### START ###");

		Collection rateList = cacheManager.getRateCacheValues();
		Collection currencyList = cacheManager.getCurrencyCacheValues();

		System.out.println("## Currency ##");
		currencyList.stream().forEach(System.out::println);
		System.out.println("## Rate ##");
		rateList.stream().forEach(System.out::println);
		System.out.println("##########");
		System.out.println("Hello world!");
	}
}
