package ro.fasttrackit.restaurant.server.model.mapper;

import org.springframework.stereotype.Component;
import ro.fasttrackit.restaurant.server.entity.RestaurantEntity;
import ro.fasttrackit.restaurant.server.model.Restaurant;

@Component
public class RestaurantMapper implements ModelMapper<Restaurant, RestaurantEntity>{

    public Restaurant toApi(RestaurantEntity entity) {

        return Restaurant.builder()
                .id(entity.getId())
                .city(entity.getCity())
                .stars(entity.getStars())
                .name(entity.getName())
                .since(entity.getSince())
                .build();
    }

    public RestaurantEntity toEntity(Restaurant entity) {

        return RestaurantEntity.builder()
                .city(entity.city())
                .stars(entity.stars())
                .name(entity.name())
                .since(entity.since())
                .build();
    }
}
