package ro.fasttrackit.restaurant.server.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
//@Data
@Getter
@Setter
@With
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int stars;
    private String city;
    private LocalDate since;

    public RestaurantEntity(String name, int stars, String city, LocalDate since) {

        this(0L, name, stars, city, since);

        /*this.id = id;
        this.name = name;
        this.stars =stars;
        this.city = city;
        this.since = since;*/
    }
}
