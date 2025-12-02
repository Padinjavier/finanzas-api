package com.padin.finanzas.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import com.padin.finanzas.model.Category;
import com.padin.finanzas.service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService service;

    @GetMapping
    public List<Category> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Category create(@RequestBody Category c) {
        return service.save(c);
    }
}
