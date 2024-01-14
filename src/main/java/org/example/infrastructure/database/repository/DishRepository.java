package org.example.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.example.infrastructure.database.repository.jpa.DishJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class DishRepository {
    private final DishJpaRepository dishJpaRepository;
}
