package org.example.api.controller.customer.dto;

import lombok.Builder;
import lombok.ToString;
import lombok.Value;
import lombok.With;

@With
@Value
@Builder
@ToString(of ={"name", "city", "street", "phone", "email"})
public class CustomerToCreateDto {

    String name;

    String city;

    String street;

    String phone;
    String email;
}
