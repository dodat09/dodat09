package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repo.CategoryRepo;
import com.repo.NewentityRepo;

import convert.newConvert;
import dto.NewDTO;
import entity.Categoryentity;
import entity.Newsentity;

@Service
public class Newservice implements INewService {

	@Autowired
	private NewentityRepo newrepo;
	
	@Autowired
	private newConvert newconvert;
	
	@Autowired
	private CategoryRepo  caterepo;

	@Override
	public NewDTO save(NewDTO newDto) {
		Categoryentity cateentity= caterepo.findonebycode(newDto.getCategoryCode());
		Newsentity entity= new Newsentity();
		entity= newconvert.toEntity(newDto);
		entity.setCategory(cateentity);
		entity=newrepo.save(entity);
		return newconvert.toDTO(entity);
	}
	@Override
	public List<Categoryentity> findall() {
		List<Categoryentity> list= caterepo.findall();
		return list;
	}
	
	
}
