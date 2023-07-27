package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Categoryentity;

public interface CategoryRepo extends JpaRepository<Categoryentity,Long>{
  Categoryentity findOneById(Long id);
//  @Modifying
//  @Query(value="update Categoryentity cate set cate.name= :name ,cate.code= :code where cate.id= :id")
//   void updateCate(@Param("name") String name,@Param("code") String code,@Param("id") Long id);
}

