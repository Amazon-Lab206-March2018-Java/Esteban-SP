package com.poesteba.books.services;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.poesteba.books.models.Book;
import com.poesteba.books.repositories.BookRepository;

@Service
public class BookService {
 
private final BookRepository bR;
public BookService(BookRepository bR){
    this.bR = bR;
	}
	
 // initialize the books variable with values
// private List<Book> books = new ArrayList<Book>(Arrays.asList(
//         new Book("Harry Potter and the Sorcerer's Stone", "A boy wizard saving the world", "english", 309, new Date(), null),
//         new Book("The Great Gatsby", "The story primarily concerns the young and mysterious millionaire Jay Gatsby", "english", 180, new Date(), null),
//         new Book("Moby Dick", "The saga of Captain Ahab", "english", 544, new Date(), null),
//         new Book("Don Quixote", "Life of a retired country gentleman", "english", 150, new Date(), null),
//         new Book("The Odyssey", "Ancient Greek epic poem", "english", 475, new Date(), null)
//         ));
 
 // returns all the books
 public ArrayList<Book> allBooks(){
     return bR.findAll();
 }
 public void addBook(Book book){
	 bR.save(book);
 }
 public Book findBookById(Long id) {
	 Optional<Book> optionalBook = bR.findById(id);
     if (optionalBook.isPresent()){
         return optionalBook.get();
     }else{
         return null;
     }
 }
// public void updateBook(Long id, Book book) {
//        if (id < books.size()){
//            books.set(id, book);
//        }
//    }
 public void destroyBook(Long id) {
	 bR.deleteById(id);
 }
 public void updateBook(Book book) {
	 bR.save(book);
}
}