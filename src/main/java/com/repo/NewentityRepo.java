package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Newsentity;

public interface NewentityRepo extends JpaRepository<Newsentity , Integer>{
    Newsentity save(Newsentity newEntity);
}
