package com.example.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.onlinebookstore.entity.BookCategory;
@RepositoryRestResource(collectionResourceRel = "bookCategory",path="book-category")
@CrossOrigin("*")
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {
}
