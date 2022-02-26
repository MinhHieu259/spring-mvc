package com.minhhieu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhhieu.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

}
