package org.example.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.example.infrastructure.database.repository.jpa.RestaurantJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class RestaurantRepository {

    private final RestaurantJpaRepository restaurantJpaRepository;
}
