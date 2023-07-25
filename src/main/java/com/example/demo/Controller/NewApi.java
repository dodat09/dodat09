package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Newservice;
import com.example.demo.dto.NewDTO;

@RestController
@RequestMapping("/a")
public class NewApi {

	@Autowired
	private Newservice newService;
	
	@PostMapping("/new")
	public NewDTO save(@RequestBody NewDTO model) {
		return newService.save(model);
	}
	
	@PutMapping("/new/{id}")
	public NewDTO save(@RequestBody NewDTO newdto,@PathVariable("id") long id) {
	return newService.save(newdto);
	}
	
}
