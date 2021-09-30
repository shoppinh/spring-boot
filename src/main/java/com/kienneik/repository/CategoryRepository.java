package com.kienneik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kienneik.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{

	CategoryEntity findOneByCode(String code);
}
