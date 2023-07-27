package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Newsentity;

public interface NewentityRepo extends JpaRepository<Newsentity , Long>{
  Newsentity findOneById(Long id);
}
