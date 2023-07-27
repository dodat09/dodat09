package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CategoryRepo;
import com.example.demo.entity.Categoryentity;

@Service
public class Cateservice implements INewService{
   @Autowired
   private CategoryRepo cateRepo;
   //thêm mới một category mới
   public void createCate(Categoryentity cate) {
	   cateRepo.save(cate);
   }
   //lấy ra tất cả các category
   public List<Categoryentity> getAllCate(){
	   List<Categoryentity> list= cateRepo.findAll();
	   return list;
   }
   //update cate dựa vào id
   public Categoryentity updatecate(Categoryentity cate,Long id) {
	   Categoryentity category= cateRepo.findOneById(id);
	   category.setName(cate.getName());
	   category.setCode(cate.getCode());
	   cateRepo.save(category);
	  return category;
   }
   //xóa cate dựa vào id
   public void deleteCate(Long id) {
	   Categoryentity cate= cateRepo.findOneById(id);
	   cateRepo.delete(cate);
   }
}
