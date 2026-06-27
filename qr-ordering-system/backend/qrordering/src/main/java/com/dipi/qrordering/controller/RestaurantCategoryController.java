package com.dipi.qrordering.controller;

import com.dipi.qrordering.model.RestaurantCategory;
import com.dipi.qrordering.service.RestaurantCategoryService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class RestaurantCategoryController {

    private final RestaurantCategoryService restaurantCategoryService;

    public RestaurantCategoryController(
            RestaurantCategoryService restaurantCategoryService) {

        this.restaurantCategoryService = restaurantCategoryService;
    }

    @PostMapping
    public RestaurantCategory createCategory(
            @RequestBody RestaurantCategory category) {

        return restaurantCategoryService.saveCategory(category);
    }

    @GetMapping
    public List<RestaurantCategory> getAllCategories() {

        return restaurantCategoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public RestaurantCategory getCategoryById(
            @PathVariable Long id) {

        return restaurantCategoryService.getCategoryById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteCategory(
            @PathVariable Long id) {

        restaurantCategoryService.deleteCategory(id);

        return "Category Deleted Successfully";
    }
}