package com.dipi.qrordering.controller;

import com.dipi.qrordering.model.RestaurantTable;
import com.dipi.qrordering.service.RestaurantTableService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tables")
public class RestaurantTableController {

    private final RestaurantTableService restaurantTableService;

    public RestaurantTableController(RestaurantTableService restaurantTableService) {
        this.restaurantTableService = restaurantTableService;
    }

    @PostMapping
    public RestaurantTable createTable(@RequestBody RestaurantTable table) {
        return restaurantTableService.saveTable(table);
    }

    @GetMapping
    public List<RestaurantTable> getAllTables() {
        return restaurantTableService.getAllTables();
    }

    @GetMapping("/{id}")
    public RestaurantTable getTableById(@PathVariable Long id) {
        return restaurantTableService.getTableById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteTable(@PathVariable Long id) {
        restaurantTableService.deleteTable(id);
        return "Table Deleted Successfully";
    }
}