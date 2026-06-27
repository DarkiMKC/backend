package com.dipi.qrordering.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "restaurant_tables")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class RestaurantTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer tableNumber;

    private String qrCode;

    private Boolean active;

    @Enumerated(EnumType.STRING)
    private TableStatus tableStatus;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
}