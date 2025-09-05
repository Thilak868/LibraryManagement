package com.example.LibraryProject.Repository;

import com.example.LibraryProject.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
