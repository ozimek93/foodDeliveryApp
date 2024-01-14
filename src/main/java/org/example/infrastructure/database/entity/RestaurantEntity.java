package org.example.infrastructure.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "restaurant")
public class RestaurantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "street")
    private String street;
    @Column(name = "city")
    private String city;
    @Column(name ="phone")
    private String phone;
    @Column(name="email")
    private String email;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurantId")
    private Set<DishEntity> dishList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurant")
    private List<OrdersEntity> orders;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurantId")
    private Set<AcceptedAddressesEntity> acceptedAddresses;
}
