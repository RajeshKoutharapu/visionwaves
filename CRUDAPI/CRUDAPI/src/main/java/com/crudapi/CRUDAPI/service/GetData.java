package com.crudapi.CRUDAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crudapi.CRUDAPI.repository.citizans;
import com.crudapi.CRUDAPI.repository.citizansRepositoryInterface;

@Component
public class GetData {
	@Autowired
	citizansRepositoryInterface repo;

	
	public List<citizans> getDataByName(String name) {
		  
   return repo.getByName(name);
		//return repo.findAll();
	}
}
