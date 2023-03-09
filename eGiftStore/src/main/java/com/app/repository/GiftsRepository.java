package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Gifts;

public interface GiftsRepository extends JpaRepository<Gifts, Long>{

}
