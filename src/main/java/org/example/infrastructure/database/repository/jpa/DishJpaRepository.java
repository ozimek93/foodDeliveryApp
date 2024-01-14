package org.example.infrastructure.database.repository.jpa;

import org.example.infrastructure.database.entity.DishEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishJpaRepository extends JpaRepository<DishEntity, Integer> {
}
