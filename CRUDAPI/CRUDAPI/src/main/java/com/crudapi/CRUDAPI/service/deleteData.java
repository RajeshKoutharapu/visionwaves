package com.crudapi.CRUDAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.crudapi.CRUDAPI.repository.employeeRepositoryInterface;

@Service
public class deleteData {
	@Autowired
employeeRepositoryInterface repo;
	
	public ResponseEntity<String> deleteByfirstName(String firstName) {
		 try {
		        repo.deleteByFirstName(firstName);
		        return ResponseEntity.ok("Data successfully deleted");
		    } catch (Exception e) {
		        return ResponseEntity.badRequest().body("invalid Input");
		    }
	}
	public ResponseEntity<String> deleteBylastName(String lastName) {
		 try {
		        repo.deleteByLastName(lastName);
		        return ResponseEntity.ok("Data successfully deleted");
		    } catch (Exception e) {
		        return ResponseEntity.badRequest().body("invalid Input");
		    }
	}
	public ResponseEntity<String> deleteByid(Integer Id) {
		 try {
		        repo.deleteById(Id);
		        return ResponseEntity.ok("Data successfully deleted");
		    } catch (Exception e) {
		        return ResponseEntity.badRequest().body("invalid Input");
		    }
	}
}
