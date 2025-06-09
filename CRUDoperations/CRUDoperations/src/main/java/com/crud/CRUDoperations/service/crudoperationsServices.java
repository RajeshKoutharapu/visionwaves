package com.crud.CRUDoperations.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.CRUDoperations.CruDoperationsApplication;
import com.crud.CRUDoperations.repository.tabletrepository;
import com.crud.CRUDoperations.repository.tablets;

@Service
public class crudoperationsServices {

	
	@Autowired
	tabletrepository repo;

   

	public void getdata(Integer Id) {
		Optional<tablets> data=repo.findById(Id);
		if(data!=null) {
			System.out.println("DATA"+data.get().toString());
		}else {
			System.out.println("INVALID DATA");
		}
	}
	public void insertdata(tablets tablet) {
		try {
			repo.save(tablet);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("INVALID DATA");
		}
		
	}
	public void updatedata(tablets tablet) {
		try {
			repo.save(tablet);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("INVALID DATA");
		}
	}
	public void deletedata(Integer id) {
		Optional<tablets> data=repo.findById(id);
		if(data!=null) {
			repo.deleteById(id);
			System.out.println("DELETED "+id+"DATA");
		}else {
			System.out.println("INVALID DATA");
		}
	}
}
