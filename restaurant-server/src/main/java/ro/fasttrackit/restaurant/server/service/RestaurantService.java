package ro.fasttrackit.restaurant.server.service;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ro.fasttrackit.restaurant.server.entity.RestaurantEntity;
import ro.fasttrackit.restaurant.server.exception.ResourceNotFoundException;
import ro.fasttrackit.restaurant.server.repository.RestaurantRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

@Service
@RequiredArgsConstructor
public class RestaurantService {
    private final RestaurantRepository repository;

    // Obtine toate restaurantele
    // - filtrare dupa city
    // - filtrare dupa stars; multiple stars
    public List<RestaurantEntity> getAll(List<Integer> stars, String city) {
        return repository.findAll().stream()
                .filter(restaurant -> city == null || restaurant.getCity().contains(city))
                .filter(restaurant -> stars == null || stars.contains((restaurant.getStars())))
                .collect(Collectors.toList());
    }

    // Obtine restaurantul cu id-ul x
    public Optional<RestaurantEntity> getById(Long id) {

        return repository.findById(id);
    }

    // Creeaza o noua entitate restaurant
    public RestaurantEntity createEntity(RestaurantEntity newEntity) {
        return repository.save(newEntity);
    }

    // Inlocuieste restaurantul cu ID-ul x
    public RestaurantEntity replaceEntity(Long id, RestaurantEntity newEntity) {
        RestaurantEntity dbEntity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Could not found restaurant with id %s".formatted(id)));

        return repository.save(dbEntity
                .withName(newEntity.getName())
                .withStars(newEntity.getStars())
                .withCity(newEntity.getCity())
                .withSince(newEntity.getSince()));
    }
}
