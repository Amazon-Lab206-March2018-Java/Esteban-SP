package com.poesteba.books.controllers;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poesteba.books.models.Book;
import com.poesteba.books.services.BookService;

@Controller
public class Books {
	
	private final BookService bS;
    public Books(BookService bS){
        this.bS = bS;
    }
	
	@RequestMapping(value="/")
	public String home() {
		return "redirect:/books";
	}
	
	@RequestMapping("/books")
    public String books(Model model) {
        ArrayList<Book> books = bS.allBooks();
        model.addAttribute("books", books);
        return "books.jsp";
    }
	@RequestMapping("/books/{id}")
    public String findBookByIndex(Model model, @PathVariable("id") Long id) {
        Book book = bS.findBookById(id);
        model.addAttribute("book", book);
        return "showBook.jsp";
    }
	@RequestMapping("/books/new")
    public String newBook(@ModelAttribute("book") Book book) {
        return "newBook.jsp";
    }
	@PostMapping("/books/new")
    public String createBook(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "newBook.jsp";
        }else{
            // Add the book            
        	bS.addBook(book);
            return "redirect:/books";
        }
    }
	@RequestMapping("/books/edit/{id}")
    public String editBook(@PathVariable("id") Long id, Model model) {
        Book book = bS.findBookById(id);
        if (book != null){
            model.addAttribute("book", book);
            return "editBook.jsp";
        }else{
            return "redirect:/books";
        }
    }
	@PostMapping("/books/edit/{id}")
    public String updateBook(@PathVariable("id") Long id, @Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "editBook.jsp";
        }else{
        	bS.updateBook(book);
            return "redirect:/books";
        }
    }
	@RequestMapping(value="/books/delete/{id}")
    public String destroyBook(@PathVariable("id") Long id) {
		bS.destroyBook(id);
        return "redirect:/books";
    }
}
