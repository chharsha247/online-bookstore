package com.example.onlinebookstore.repository;
import com.example.onlinebookstore.entity.*; 
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book,Long> {

}
