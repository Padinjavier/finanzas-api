package com.padin.finanzas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.padin.finanzas.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
