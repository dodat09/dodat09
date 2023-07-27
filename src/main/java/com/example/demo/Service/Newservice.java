package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CategoryRepo;
import com.example.demo.Repository.NewentityRepo;
import com.example.demo.entity.Categoryentity;
import com.example.demo.entity.Newsentity;

import jakarta.persistence.EntityManager;

@Service
public class Newservice implements INewService {

	@Autowired
	private NewentityRepo newrepo;	
	@Autowired
	private CategoryRepo  caterepo;
	@Autowired
	private EntityManager  entityManager;

	//thêm mói một newentity
	public Newsentity createNew(Newsentity newEntity,Long id) {
		Categoryentity cate= entityManager.find(Categoryentity.class, id);
		newEntity.setCategory(cate);
		entityManager.persist(newEntity);
		return newEntity;
	}
	//hiển thị tất cả các newentity
	public List<Newsentity > getAllNew(){
		List <Newsentity> list= newrepo.findAll();
		return list;
	}
	//upsdate  newentity thông qua id
	public Newsentity updateNew(Newsentity newEntity,Long id) {
		Newsentity newentity  = newrepo.findOneById(id);
		newentity.setCategory(newEntity.getCategory());
		newentity.setContent(newEntity.getContent());
		newentity.setShortdescription(newEntity.getShortdescription());
		newentity.setThumbnail(newEntity.getThumbnail());
		newentity.setTitle(newEntity.getTitle());
		newrepo.save(newentity);
		return newentity;
	}
	//xóa newentity thông qua id
	public void deteleNew(Long id) {
		Newsentity newentity= newrepo.findOneById(id);
		newrepo.delete(newentity);
	}
	
}
