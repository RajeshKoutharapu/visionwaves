package com.crud.CRUDoperations;

import com.crud.CRUDoperations.repository.tablets;
import com.crud.CRUDoperations.service.crudoperationsServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CruDoperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruDoperationsApplication.class, args);
ApplicationContext context = SpringApplication.run(CruDoperationsApplication.class, args);
		
		// Get the service bean from context
		crudoperationsServices service = context.getBean(crudoperationsServices.class);
		//use this method to get data by id
		service.getdata(1);
		//use this method to insert data
		service.insertdata(new tablets(7,"b12",100,"100g"));
		//use this method for delete data by id
		      //service.deletedata(1);
		//use this method to update data
	         //	service.updatedata(new tablets(7,"b12",100,"100g"));

	}

}
