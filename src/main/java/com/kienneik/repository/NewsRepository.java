package com.kienneik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kienneik.entity.NewsEntity;

public interface NewsRepository extends JpaRepository<NewsEntity, Long>{

}
