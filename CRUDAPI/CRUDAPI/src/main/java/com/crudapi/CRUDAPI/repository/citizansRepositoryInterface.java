package com.crudapi.CRUDAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface citizansRepositoryInterface extends JpaRepository<citizans, Integer> {

	      // public List<citizans> findByName(String name);
    @Query("SELECT c FROM citizans c WHERE LOWER(c.name) = LOWER(:name)")
    List<citizans> getByName(@Param("name") String name);
}
