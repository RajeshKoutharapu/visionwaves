package com.crudapi.CRUDAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudapi.CRUDAPI.repository.employee;
import com.crudapi.CRUDAPI.repository.employeeRepositoryInterface;

@Service
public class updateData {
@Autowired 
employeeRepositoryInterface repo;

public employee updateFirstName(Integer id,String firstname) {
   repo.updateFirstNameById(id,firstname);
   return repo.findById(id).get();
	
}

public employee updateLastName(Integer id,String lastname) {
 repo.updateLastNameById(id, lastname);
 return repo.findById(id).get();
}

}
