package com.warehouse.warehouse_management.controller;


import com.warehouse.warehouse_management.dto.CategoryRequest;
import com.warehouse.warehouse_management.dto.CategoryResponse;
import com.warehouse.warehouse_management.service.CategoryService;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {


    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryResponse createCategory(@Valid @RequestBody CategoryRequest request){
        return categoryService.createCategory(request);
    }


    @GetMapping
    public List<CategoryResponse> getAllCategories(){
        return categoryService.getAllCategories();
    }
}
