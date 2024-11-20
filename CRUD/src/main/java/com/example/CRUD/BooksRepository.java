package com.example.CRUD;

import org.springframework.data.repository.CrudRepository;
import com.example.CRUD.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}