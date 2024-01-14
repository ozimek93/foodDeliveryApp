package org.example.infrastructure.database.repository;

import lombok.AllArgsConstructor;
import org.example.infrastructure.database.repository.jpa.AcceptedAddressesJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class AcceptedAddressesRepository {

    private final AcceptedAddressesJpaRepository acceptedAddressesJpaRepository;
}
