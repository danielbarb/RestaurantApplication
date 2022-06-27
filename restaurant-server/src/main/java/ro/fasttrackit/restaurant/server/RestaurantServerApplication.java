package ro.fasttrackit.restaurant.server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ro.fasttrackit.restaurant.server.entity.RestaurantEntity;
import ro.fasttrackit.restaurant.server.repository.RestaurantRepository;

import java.time.LocalDate;
import java.util.List;
@SpringBootApplication
public class RestaurantServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantServerApplication.class, args);
	}
	
	@Bean
	CommandLineRunner startup (RestaurantRepository repository){

		return args -> {
			repository.saveAll(List.of(
					new RestaurantEntity("Restaurant1", 1, "Bucuresti", LocalDate.now()),
					new RestaurantEntity("Restaurant2", 1, "Cluj", LocalDate.now()),
					new RestaurantEntity("Restaurant3", 2, "Timisoara", LocalDate.now()),
					new RestaurantEntity("Restaurant4", 3, "Bacau", LocalDate.now()),
					new RestaurantEntity("Restaurant5", 1, "Constanta", LocalDate.now()),
					new RestaurantEntity("Restaurant6", 1, "Oradea", LocalDate.now()),
					new RestaurantEntity("Restaurant7", 1, "Brasov", LocalDate.now()),
					new RestaurantEntity("Restaurant8", 2, "Sibiu", LocalDate.now()),
					new RestaurantEntity("Restaurant9", 3, "Craiova", LocalDate.now()),
					new RestaurantEntity("Restaurant10", 1, "Bucuresti", LocalDate.now()),
					new RestaurantEntity("Restaurant11", 1, "Brason", LocalDate.now()),
					new RestaurantEntity("Restaurant12", 2, "Cluj", LocalDate.now()),
					new RestaurantEntity("Restaurant13", 1, "Bucuresti", LocalDate.now()),
					new RestaurantEntity("Restaurant14", 1, "Cluj", LocalDate.now()),
					new RestaurantEntity("Restaurant15", 2, "Timisoara", LocalDate.now()),
					new RestaurantEntity("Restaurant16", 3, "Bacau", LocalDate.now()),
					new RestaurantEntity("Restaurant17", 1, "Constanta", LocalDate.now()),
					new RestaurantEntity("Restaurant18", 1, "Oradea", LocalDate.now()),
					new RestaurantEntity("Restaurant19", 4, "Brasov", LocalDate.now()),
					new RestaurantEntity("Restaurant20", 2, "Sibiu", LocalDate.now()),
					new RestaurantEntity("Restaurant21", 3, "Craiova", LocalDate.now()),
					new RestaurantEntity("Restaurant22", 1, "Bucuresti", LocalDate.now()),
					new RestaurantEntity("Restaurant23", 1, "Brason", LocalDate.now()),
					new RestaurantEntity("Restaurant24", 2, "Cluj", LocalDate.now()),
					new RestaurantEntity("Restaurant25", 1, "Bucuresti", LocalDate.now()),
					new RestaurantEntity("Restaurant26", 3, "Cluj", LocalDate.now()),
					new RestaurantEntity("Restaurant27", 2, "Timisoara", LocalDate.now()),
					new RestaurantEntity("Restaurant28", 3, "Bacau", LocalDate.now()),
					new RestaurantEntity("Restaurant29", 1, "Constanta", LocalDate.now()),
					new RestaurantEntity("Restaurant30", 1, "Oradea", LocalDate.now()),
					new RestaurantEntity("Restaurant31", 1, "Brasov", LocalDate.now()),
					new RestaurantEntity("Restaurant32", 2, "Sibiu", LocalDate.now()),
					new RestaurantEntity("Restaurant33", 3, "Craiova", LocalDate.now()),
					new RestaurantEntity("Restaurant34", 1, "Bucuresti", LocalDate.now()),
					new RestaurantEntity("Restaurant35", 1, "Brason", LocalDate.now()),
					new RestaurantEntity("Restaurant36", 2, "Cluj", LocalDate.now())
			));
		};
	}
}
