package ro.fasttrackit.restaurant.server.model.mapper;

import java.util.List;

public interface ModelMapper<T, S> {
    default List<T> toApi(List<S> entities){
        return entities.stream()
                .map(this::toApi)
                .toList();
    }
    T toApi(S entity);

    default List<S> toEntity(List<T> entities) {
        return entities.stream()
                .map(this::toEntity)
                .toList();
    }

    S toEntity(T entity);
}
