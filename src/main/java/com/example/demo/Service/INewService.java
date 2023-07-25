package com.example.demo.Service;

import java.util.List;

import com.example.demo.dto.NewDTO;
import com.example.demo.entity.Newsentity;

public interface INewService {
  NewDTO save(NewDTO newdto);
//  NewDTO update(NewDTO newdto);
   List<Newsentity> getEntity();
}
