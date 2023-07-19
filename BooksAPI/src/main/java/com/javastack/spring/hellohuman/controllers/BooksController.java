package com.javastack.spring.hellohuman.controllers;

import java.net.http.HttpClient.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javastack.spring.hellohuman.models.Book;
import com.javastack.spring.hellohuman.services.BookService;

@Controller
public class BooksController {
	
	@Autowired
	BookService bookService;
@RequestMapping("/")
public String index(Model model) {
	model.addAttribute("allBooks", bookService.allBooks());
	return "Index.jsp";
}
@RequestMapping(value="/create", method=RequestMethod.POST)
public String create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
    Book book = new Book(title, desc, lang, numOfPages);
    bookService.createBook(book);
    return "redirect:/";
    
}



}
