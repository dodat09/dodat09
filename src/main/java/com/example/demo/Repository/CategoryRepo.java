package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Categoryentity;

public interface CategoryRepo extends JpaRepository<Categoryentity,Long>{
  Categoryentity findOneByCode(String code);
}

