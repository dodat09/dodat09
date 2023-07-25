package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CategoryRepo;
import com.example.demo.Repository.NewentityRepo;
import com.example.demo.convert.newConvert;
import com.example.demo.dto.NewDTO;
import com.example.demo.entity.Categoryentity;
import com.example.demo.entity.Newsentity;

@Service
public class Newservice implements INewService {

	@Autowired
	private NewentityRepo newrepo;
	
	@Autowired
	private newConvert newconvert;
	
	@Autowired
	private CategoryRepo  caterepo;

	@Override
	public NewDTO save(NewDTO newdto) {
		Newsentity newentity = new Newsentity();
		if(newdto.getId()!= null) {
			Newsentity oldEntity = newconvert.toEntity(newrepo.findOneById(newdto.getId()));
	        Newsentity newEntity=newconvert.toEntity(newdto, oldEntity);
		}else {
			 newentity =newconvert.toEntity(newdto);
		}
		Categoryentity category = caterepo.findOneByCode(newdto.getCategoryCode());
		
		newentity.setCategory(category);
		newentity= newrepo.save(newentity);
		return newconvert.toDTO(newentity);
	}
	@Override
	public List<Newsentity> getEntity() {
		List<Newsentity> list= new ArrayList();
		newrepo.findAll().forEach(e->list.add(e));
		return list;
	}
//	@Override
//	public NewDTO update(NewDTO newdto) {
//	
//	Categoryentity category= caterepo.findOneByCode(newdto.getCategoryCode());
//	newEntity.setCategory(category);
//	newEntity = newrepo.save(newEntity);
//		return newconvert.toDTO(newEntity);
//	}
//	
	
}
