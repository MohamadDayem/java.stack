package com.javastack.spring.hellohuman.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javastack.spring.hellohuman.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

	  List<Book> findAll();
	    // this method finds books with descriptions containing the search string
	    List<Book> findByDescriptionContaining(String search);
	    // this method counts how many titles contain a certain string
	
}
