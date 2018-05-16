package com.poesteba.books.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poesteba.books.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	ArrayList<Book> findAll();
	
}
