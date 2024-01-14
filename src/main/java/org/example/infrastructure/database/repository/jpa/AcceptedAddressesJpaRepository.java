package org.example.infrastructure.database.repository.jpa;

import org.example.infrastructure.database.entity.AcceptedAddressesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcceptedAddressesJpaRepository extends JpaRepository<AcceptedAddressesEntity, Integer> {
}
