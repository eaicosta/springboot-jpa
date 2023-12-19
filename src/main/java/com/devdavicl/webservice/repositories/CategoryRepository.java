package com.devdavicl.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdavicl.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
