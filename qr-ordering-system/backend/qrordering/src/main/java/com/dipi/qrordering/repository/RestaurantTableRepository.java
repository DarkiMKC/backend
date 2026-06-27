package com.dipi.qrordering.repository;

import com.dipi.qrordering.model.RestaurantTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantTableRepository
        extends JpaRepository<RestaurantTable, Long> {

}