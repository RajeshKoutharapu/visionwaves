package com.crudop.basicCRUDOperations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.admin.SpringApplicationAdminJmxAutoConfiguration;
import org.springframework.context.ApplicationContext;

import com.crudop.basicCRUDOperations.repository.tablets;
import com.crudop.basicCRUDOperations.service.crudoperationsServices;

@SpringBootApplication
public class BasicCrudOperationsApplication {

	public static void main(String[] args) {
ApplicationContext context = SpringApplication.run(BasicCrudOperationsApplication.class, args);
		
		// Get the service bean from context
		crudoperationsServices service = context.getBean(crudoperationsServices.class);
		//use this method to get data by id
		service.getdata(1);
		//use this method to insert data
		service.insertdata(new tablets(8,"b12",100,"100g"));
		//use this method for delete data by id
		      //service.deletedata(1);
		//use this method to update data
	         //	service.updatedata(new tablets(7,"b12",100,"100g"));

	}

}
