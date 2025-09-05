package com.example.LibraryProject.Service.impl;

import com.example.LibraryProject.Repository.BookRepository;
import com.example.LibraryProject.Service.BookService;
import com.example.LibraryProject.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceimpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElseThrow();
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Long id, Book book) {
        Book existing = bookRepository.findById(id).orElseThrow();
        existing.setTitle(book.getTitle());
        existing.setIsbn(book.getIsbn());
        existing.setAuthor(book.getAuthor());
        return bookRepository.save(existing);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
