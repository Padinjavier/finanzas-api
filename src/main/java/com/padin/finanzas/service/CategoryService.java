package com.padin.finanzas.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.padin.finanzas.model.Category;
import com.padin.finanzas.repository.CategoryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repo;

    public List<Category> findAll() {
        return repo.findAll();
    }

    public Category save(Category c) {
        return repo.save(c);
    }
}
