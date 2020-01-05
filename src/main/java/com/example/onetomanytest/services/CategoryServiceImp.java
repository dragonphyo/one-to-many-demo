package com.example.onetomanytest.services;

import com.example.onetomanytest.domain.Category;
import com.example.onetomanytest.repository.CategoryRepository;


public class CategoryServiceImp implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImp(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }
}
