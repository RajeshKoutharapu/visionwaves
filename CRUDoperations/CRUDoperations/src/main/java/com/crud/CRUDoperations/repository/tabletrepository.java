package com.crud.CRUDoperations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface tabletrepository extends JpaRepository<tablets, Integer> {

}
