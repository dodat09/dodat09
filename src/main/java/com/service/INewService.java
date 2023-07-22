package com.service;

import java.util.List;

import dto.NewDTO;
import entity.Categoryentity;

public interface INewService {
   NewDTO save(NewDTO newDto);
   List<Categoryentity> findall();
}
