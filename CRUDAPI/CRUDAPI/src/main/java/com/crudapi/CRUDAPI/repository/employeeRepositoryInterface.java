package com.crudapi.CRUDAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

import java.util.List;


public interface employeeRepositoryInterface extends JpaRepository<employee, Integer> {
	
	
	      // public List<citizans> findByName(String name);
    @Query("SELECT c FROM employee c WHERE LOWER(c.lastname) = LOWER(:lastname)")
    List<employee> getByName(@Param("lastname") String lastname);
    @Transactional
    @Modifying
    @Query("UPDATE employee e SET e.firstname = :firstname WHERE e.id = :id")
    Integer updateFirstNameById(@Param("id") Integer id, @Param("firstname") String firstname);
    @Transactional
    @Modifying
    @Query("UPDATE employee e SET e.lastname = :lastname WHERE e.id = :id")
    Integer updateLastNameById(@Param("id") Integer id, @Param("lastname") String lastname);
    
    @Modifying
    @Transactional
    @Query("DELETE FROM employee e WHERE e.firstname = :firstname")
    void deleteByFirstName(@Param("firstname") String firstname);
    
    @Modifying
    @Transactional
    @Query("DELETE FROM employee e WHERE e.lastname = :lastname")
    void deleteByLastName(@Param("lastname") String lastname);
    
   
   
    

}
