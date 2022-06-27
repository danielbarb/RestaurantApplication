package ro.fasttrackit.restaurant.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.restaurant.server.entity.RestaurantEntity;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {
}
