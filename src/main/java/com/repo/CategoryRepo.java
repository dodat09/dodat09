package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Categoryentity;

public interface CategoryRepo extends JpaRepository<Categoryentity,Integer>{
   Categoryentity findonebycode(String code);
   List<Categoryentity> findall();
}
