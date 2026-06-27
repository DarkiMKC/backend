package com.dipi.qrordering.repository;

import com.dipi.qrordering.model.RestaurantCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantCategoryRepository
        extends JpaRepository<RestaurantCategory, Long> {

}