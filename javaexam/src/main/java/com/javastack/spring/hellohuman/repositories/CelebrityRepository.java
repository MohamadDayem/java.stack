package com.javastack.spring.hellohuman.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javastack.spring.hellohuman.models.Celebrity;


@Repository
public interface CelebrityRepository extends CrudRepository<Celebrity,Long> {

	//List<Celebrity> findAllCelebrities();
}
