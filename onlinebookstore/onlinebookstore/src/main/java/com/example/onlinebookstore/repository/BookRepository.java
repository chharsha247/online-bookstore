package com.example.onlinebookstore.repository;
import com.example.onlinebookstore.entity.*; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@RepositoryRestResource(collectionResourceRel = "books",path="books")
@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book,Long> {

}
