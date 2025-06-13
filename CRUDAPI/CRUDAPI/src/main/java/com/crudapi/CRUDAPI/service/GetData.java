package com.crudapi.CRUDAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.crudapi.CRUDAPI.repository.employee;
import com.crudapi.CRUDAPI.repository.employeeRepositoryInterface;

@Component
public class GetData {
	@Autowired
	employeeRepositoryInterface repo;

	
	public List<employee> getDataByName(String name) {
		  
   return repo.getByName(name);
		//return repo.findAll();
	}
}
