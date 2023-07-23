package com.javastack.spring.hellohuman.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javastack.spring.hellohuman.models.dojos;

@Repository
public interface dojosRepository extends CrudRepository<dojos,Long> {

	 
	List<dojos> findAll();
	
}





