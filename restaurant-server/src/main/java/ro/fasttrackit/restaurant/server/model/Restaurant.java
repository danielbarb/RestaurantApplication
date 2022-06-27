package ro.fasttrackit.restaurant.server.model;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record Restaurant(Long id, String name, int stars, String city, LocalDate since) {
}
