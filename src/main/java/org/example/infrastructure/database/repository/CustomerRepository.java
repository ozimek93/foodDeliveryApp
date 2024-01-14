package org.example.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.example.infrastructure.database.entity.CustomerEntity;
import org.example.infrastructure.database.repository.jpa.CustomerJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CustomerRepository {
    private final CustomerJpaRepository customerJpaRepository;

    public CustomerEntity createCustomer(CustomerEntity customer) {
        return customerJpaRepository.saveAndFlush(customer);
    }
}
