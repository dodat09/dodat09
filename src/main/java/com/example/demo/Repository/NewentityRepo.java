package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.NewDTO;
import com.example.demo.entity.Newsentity;

public interface NewentityRepo extends JpaRepository<Newsentity , Long>{
  NewDTO findOneById(Long id);
}
