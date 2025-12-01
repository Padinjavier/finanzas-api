package com.padin.finanzas.category;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
