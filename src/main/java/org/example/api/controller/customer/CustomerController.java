package org.example.api.controller.customer;

import lombok.AllArgsConstructor;
import org.example.api.controller.customer.dto.CustomerToCreateDto;
import org.example.business.CustomerService;
import org.example.domain.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerController {
    private CustomerService customerService;

    @PostMapping
    public Customer createCustomer(
            @RequestParam String name,
            @RequestParam String city,
            @RequestParam String street,
            @RequestParam String phone,
            @RequestParam String email
    ) {
        CustomerToCreateDto customer = CustomerToCreateDto.builder()
                .city(city)
                .email(email)
                .phone(phone)
                .name(name)
                .street(street)
                .build();
        return customerService.createCustomer(customer);
    }
}
