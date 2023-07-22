package convert;

import org.springframework.stereotype.Component;

import dto.NewDTO;
import entity.Newsentity;

@Component
public class newConvert {
	public Newsentity toEntity(NewDTO newDTO) {
		Newsentity entity = new Newsentity();
		entity.setTitle(newDTO.getTitle());
		entity.setContent(newDTO.getContent());
		entity.setThumbnail(newDTO.getThumbnail());
		entity.setCategoryid(newDTO.getCategoryCode());
		entity.setShortdescription(newDTO.getShortDescription());
		return entity;

	}
	public NewDTO toDTO(Newsentity newentity) {
		NewDTO newdto = new NewDTO(null, null, null, null, null);
		newdto.setCategoryCode(newdto.getCategoryCode());
		newdto.setTitle(newentity.getTitle());
		newdto.setContent(newentity.getContent());
		newdto.setThumbnail(newentity.getThumbnail());
		newdto.setShortDescription(newentity.getShortdescription());
		return newdto;

	}
}
