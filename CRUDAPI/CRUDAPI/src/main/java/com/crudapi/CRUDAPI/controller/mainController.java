package com.crudapi.CRUDAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudapi.CRUDAPI.repository.employee;
import com.crudapi.CRUDAPI.service.GetData;
import com.crudapi.CRUDAPI.service.deleteData;
import com.crudapi.CRUDAPI.service.updateData;

@RestController
public class mainController {
	
	@Autowired
	GetData getdata;
	@Autowired
	deleteData deletedata;
	@Autowired
	updateData updatedata;
	
	@GetMapping("/getdata/{name}")
	public ResponseEntity<List<employee>> getInformation(@PathVariable String name){
		
		return new ResponseEntity<List<employee>>(getdata.getDataByName(name),HttpStatus.OK);
		
	}
	@PatchMapping("/firstnameupdate/{id}/{firstname}")
	public ResponseEntity<employee>firstnameupdate(@PathVariable  Integer id,@PathVariable String firstname){
		return new ResponseEntity<employee>(updatedata.updateFirstName(id, firstname),HttpStatus.OK);
	}
	@PatchMapping("/lastnameupdate/{id}/{lastname}")
	public ResponseEntity<employee>firstlastupdate(@PathVariable  Integer id,@PathVariable String lastname){
		return new ResponseEntity<employee>(updatedata.updateLastName(id, lastname),HttpStatus.OK);
	}
    
	@DeleteMapping("/deletebyfirstname/{firstname}")
	public ResponseEntity<String>deletebyfirstName(@PathVariable String firstname){
		return deletedata.deleteByfirstName(firstname);
	}
	@DeleteMapping("/deletebylastname/{lastname}")
	public ResponseEntity<String>deletebylastName(@PathVariable String lastname){
		return deletedata.deleteBylastName(lastname);
	}
	@DeleteMapping("/deletebyid/{id}")
	public ResponseEntity<String>deletebylastName(@PathVariable Integer id){
		return deletedata.deleteByid(id);
	}
	
}
