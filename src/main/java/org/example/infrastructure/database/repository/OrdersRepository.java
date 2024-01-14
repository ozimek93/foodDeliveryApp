package org.example.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.example.infrastructure.database.repository.jpa.OrdersJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class OrdersRepository {
    private final OrdersJpaRepository ordersJpaRepository;
}
