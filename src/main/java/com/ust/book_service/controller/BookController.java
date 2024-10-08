package com.ust.book_service.controller;

import com.ust.book_service.dao.BookDao;
import com.ust.book_service.entity.BookEntity;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookDao bookDao;

    @GetMapping("/books")
    public List<BookEntity> getAllBooks(){
        return bookDao.findAll();
    }

    @GetMapping("/books/{bookId}")
    public BookEntity getABook(@PathVariable("bookId") long bookId){
        return bookDao.findById(bookId).orElse(null);
    }

    @PostMapping("/books")
    public BookEntity addBooks(@RequestBody BookEntity bookEntity){
        return bookDao.save(bookEntity);
    }

    @DeleteMapping("/books/{bookID}")
    public void deleteBook(@PathVariable("bookId")long bookId){
        bookDao.deleteById(bookId);
    }
}