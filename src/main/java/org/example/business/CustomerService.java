package org.example.business;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.api.controller.customer.dto.CustomerToCreateDto;
import org.example.domain.Customer;
import org.example.infrastructure.database.entity.CustomerEntity;
import org.example.infrastructure.database.repository.CustomerRepository;
import org.example.infrastructure.database.repository.mapper.CustomerMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Transactional
    public Customer createCustomer(CustomerToCreateDto customer){
        CustomerEntity customerEntity = customerMapper.customerToCreateDtoToCustomerEntity(customer);
        CustomerEntity customerCreated = customerRepository.createCustomer(customerEntity);
        return customerMapper.customerEntityToCustomerToCreate(customerCreated);
    }
}
