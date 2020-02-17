package com.myntra.itineraryservice;

import com.myntra.itineraryservice.model.clotherservice.Cloth;
import com.myntra.itineraryservice.model.priceservice.Price;
import com.myntra.itineraryservice.model.storeservice.Store;
import com.myntra.itineraryservice.repository.ClothRepository;
import com.myntra.itineraryservice.repository.PriceRepository;
import com.myntra.itineraryservice.repository.StoreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;

@SpringBootApplication
@EnableEurekaClient
public class ItineraryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItineraryServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	@Bean
	@LoadBalanced
	public WebClient.Builder getWebClient()  {
		return WebClient.builder();
		}

	@Bean
	public CommandLineRunner getCommandLineRunner(ClothRepository clothRepository, PriceRepository priceRepository, StoreRepository storeRepository) {

		return (args) -> {

			Cloth cloth= new Cloth("C1","D1","M1","M");
			Cloth cloth1= new Cloth("C2","D2","M2","F");
			Cloth cloth2= new Cloth("C3","D3","M3","F");
			Cloth cloth3= new Cloth("C4","D4","M4","F");
			Cloth cloth4= new Cloth("C5","D5","M5","M");
			clothRepository.saveAll(Arrays.asList(cloth,cloth1,cloth2,cloth3,cloth4));
			Price price = new Price(100L,cloth);
			Price price1 = new Price(1003L,cloth1);
			Price price2 = new Price(1002L,cloth2);
			Price price3 = new Price(1000L,cloth3);
			Price price4 = new Price(500L,cloth4);
			priceRepository.saveAll(Arrays.asList(price,price1,price2,price3,price4));
			Store store = new Store(5,cloth);
			Store store1 = new Store(30,cloth1);
			Store store2= new Store(20,cloth2);
			Store store3 = new Store(10,cloth3);
			Store store4 = new Store(2,cloth4);

			storeRepository.saveAll(Arrays.asList(store,store1,store2,store3,store4));
		};
	}

}
