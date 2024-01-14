package org.example.infrastructure.database.repository.mapper;

import lombok.NoArgsConstructor;
import org.example.api.controller.customer.dto.CustomerToCreateDto;
import org.example.domain.Customer;
import org.example.infrastructure.database.entity.CustomerEntity;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Service
public class CustomerMapper {

    public CustomerEntity customerToCreateMapToCustomerEntity (Customer customer){
        return CustomerEntity.builder()
                .phone(customer.getPhone())
                .email(customer.getEmail())
                .city(customer.getCity())
                .name(customer.getName())
                .street(customer.getStreet())
                .build();
    }
    public Customer customerEntityToCustomerToCreate(CustomerEntity customer){
        return Customer.builder()
                .id(customer.getId())
                .phone(customer.getPhone())
                .email(customer.getEmail())
                .city(customer.getCity())
                .name(customer.getName())
                .street(customer.getStreet())
                .build();
    }
    public CustomerEntity customerToCreateDtoToCustomerEntity(CustomerToCreateDto customer){
        return CustomerEntity.builder()
                .phone(customer.getPhone())
                .email(customer.getEmail())
                .city(customer.getCity())
                .name(customer.getName())
                .street(customer.getStreet())
                .build();
    }
}
