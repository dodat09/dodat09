package com.example.demo.convert;

import org.springframework.stereotype.Component;

import com.example.demo.dto.NewDTO;
import com.example.demo.entity.Newsentity;

@Component
public class newConvert {
	public Newsentity toEntity(NewDTO newDTO) {
		Newsentity entity = new Newsentity();
		entity.setTitle(newDTO.getTitle());
		entity.setContent(newDTO.getContent());
		entity.setThumbnail(newDTO.getThumbnail());
		
		entity.setShortdescription(newDTO.getShortDescription());
		return entity;

	}
	public NewDTO toDTO(Newsentity newentity) {
		NewDTO newdto = new NewDTO();	
		if(newentity.getId()!= null) {
			newdto.setId(newentity.getId());
		}
		
		newdto.setTitle(newentity.getTitle());
		newdto.setContent(newentity.getContent());
		newdto.setThumbnail(newentity.getThumbnail());
		newdto.setShortDescription(newentity.getShortdescription());
		newdto.setCreatedDate(newentity.getCreateDate());
		newdto.setCreatedBy(newentity.getCreatedBy());
		newdto.setModifiedDate(newentity.getModifiedDate());
		newdto.setModifiedBy(newentity.getModifiedBy());
		return newdto;

	}
	public Newsentity toEntity(NewDTO newDTO,Newsentity entity) {
		
		entity.setTitle(newDTO.getTitle());
		entity.setContent(newDTO.getContent());
		entity.setThumbnail(newDTO.getThumbnail());
		entity.setShortdescription(newDTO.getShortDescription());
		return entity;

	}
}
