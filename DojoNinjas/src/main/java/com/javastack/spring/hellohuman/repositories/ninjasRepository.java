package com.javastack.spring.hellohuman.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javastack.spring.hellohuman.models.ninjas;

@Repository
public interface ninjasRepository extends CrudRepository<ninjas, Long> {

	
	List<ninjas> findAll();
}
