package com.example.DemoGraphQL.repository;

import com.example.DemoGraphQL.model.Author;
import com.example.DemoGraphQL.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByAuthor(Author author);
}
