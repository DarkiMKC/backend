package com.dipi.qrordering.service;

import com.dipi.qrordering.model.RestaurantCategory;
import com.dipi.qrordering.repository.RestaurantCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantCategoryService {

    private final RestaurantCategoryRepository restaurantCategoryRepository;

    public RestaurantCategoryService(
            RestaurantCategoryRepository restaurantCategoryRepository) {

        this.restaurantCategoryRepository = restaurantCategoryRepository;
    }

    public RestaurantCategory saveCategory(
            RestaurantCategory category) {

        return restaurantCategoryRepository.save(category);
    }

    public List<RestaurantCategory> getAllCategories() {

        return restaurantCategoryRepository.findAll();
    }

    public RestaurantCategory getCategoryById(Long id) {

        return restaurantCategoryRepository
                .findById(id)
                .orElse(null);
    }

    public void deleteCategory(Long id) {

        restaurantCategoryRepository.deleteById(id);
    }
}