package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.INewService;

import dto.NewDTO;
import entity.Categoryentity;

@RestController
@RequestMapping("/a")
public class NewApi {

	@Autowired
	private INewService newService;
	
	@PostMapping(value="/new")
	public NewDTO createNew(@RequestBody NewDTO model) {
		return newService.save(model);
	}
	
	@GetMapping(value="/list")
	public List<Categoryentity> getallcate(){
		return newService.findall();
	}
	
}
