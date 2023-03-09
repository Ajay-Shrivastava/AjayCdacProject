package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.GiftCategory;

public interface CategoryRepository extends JpaRepository<GiftCategory, Long> {

}
