package com.crudapi.CRUDAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crudapi.CRUDAPI.repository.citizans;
import com.crudapi.CRUDAPI.service.GetData;

@RestController
public class mainController {
	
	@Autowired
	GetData getdata;
	
	@GetMapping("/getdata/{name}")
	public ResponseEntity<List<citizans>> getInformation(@PathVariable String name){
		
		return new ResponseEntity<List<citizans>>(getdata.getDataByName(name),HttpStatus.OK);
		
	}

}
