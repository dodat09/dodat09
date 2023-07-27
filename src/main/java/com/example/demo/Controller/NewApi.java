package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Cateservice;
import com.example.demo.Service.Newservice;
import com.example.demo.entity.Categoryentity;
import com.example.demo.entity.Newsentity;

@RestController
@RequestMapping("/b")
public class NewApi {

	@Autowired
	private Newservice newService;
	
	@Autowired
	private Cateservice cateService;
	
	//them moi category
	@PostMapping("/cate")
	public void createCate(@RequestBody Categoryentity cate) {
		cateService.createCate(cate);
	}
	//lấy ra tất cả các category
	@GetMapping("/cate")
	public List<Categoryentity> getAllCate(){
		return cateService.getAllCate();
	}
	//update catagory thông qua id
	@PutMapping("/cate/{id}")
	public Categoryentity updateCate(@RequestBody Categoryentity cate,@PathVariable("id") Long id) {
		return cateService.updatecate(cate, id);
	}
	//xóa category thông qua id
	@DeleteMapping("cate/{id}")
	public void deleteCate(@PathVariable("id") Long id) {
		cateService.deleteCate(id);
	}
	
	//////thêm mới một new entity
	@PostMapping("/new/{id}")
	public Newsentity createNew(@RequestBody Newsentity newEntity,@PathVariable("id") Long id) {
		return newService.createNew(newEntity,id);
	}
	//hienr thị tất cả các newentity
	@GetMapping("/new")
	public List<Newsentity> getAllNew() {
		return newService.getAllNew();
	}
	//update lại newentity dựa vào id
	@PutMapping("/new/{id}")
	public Newsentity updateNew(@RequestBody Newsentity newentity,@PathVariable("id") Long id) {
		return newService.updateNew(newentity, id);
	}
	//xóa newentity dựa vào id
	@DeleteMapping("/new/{id}")
	public void deleteNew(@PathVariable("id") Long id) {
		newService.deteleNew(id);
	}
}











