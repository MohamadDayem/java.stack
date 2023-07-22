package com.javastack.spring.hellohuman.repositories;

import org.springframework.data.repository.CrudRepository;

import com.javastack.spring.hellohuman.models.Burger;

public interface BurgerRepository extends CrudRepository<Burger, Long> {

}
