package ro.fasttrackit.restaurant.server.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import ro.fasttrackit.restaurant.server.entity.RestaurantEntity;
import ro.fasttrackit.restaurant.server.exception.ResourceNotFoundException;
import ro.fasttrackit.restaurant.server.model.Restaurant;
import ro.fasttrackit.restaurant.server.model.RestaurantFilter;
import ro.fasttrackit.restaurant.server.model.mapper.RestaurantMapper;
import ro.fasttrackit.restaurant.server.service.RestaurantService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("restaurants")
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService service;
    private final RestaurantMapper mapper;

    // Returneaza toate restaurantele
    //@GetMapping
    //List<RestaurantEntity> getAll(Pageable pageable){
    //     return service.getAll(pageable).stream()
    //            .toList();
    //}

    // Returneaza restaurantele filtrate dupa city si/sau stars
    // stars Permite mai multe valori
    @GetMapping
    List<RestaurantEntity> getAll(RestaurantFilter filter){
        return service.getAll(filter.stars(), filter.city())
                .stream().toList();
    }

    // Returneaza restaurantul dupa id
    // Nu-mi arata eroarea ???
    @GetMapping("{id}")
    Optional<RestaurantEntity> getById(@PathVariable Long id){
        return Optional.ofNullable(service.getById(id).orElseThrow(()-> new ResourceNotFoundException("test")));
                //.orElseThrow(() -> new ResourceNotFoundException("Not found restaurant with id " + id));
    }

    // Salveaza o noua entitate restaurant
    @PostMapping
    RestaurantEntity createRestaurant(@RequestBody RestaurantEntity newEntity){
        return service.createEntity(newEntity);

    }
    @PutMapping("{id}")
    RestaurantEntity replace(@PathVariable Long id, @RequestBody Restaurant newEntity){
        return service.replaceEntity(id, mapper.toEntity(newEntity));
    }

}
