package com.hasko.springcorelab.ders4;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService service;
    public BookController(BookService service){
        this.service =service;
    }
    @GetMapping
    public List<String> allBooks(){
       return service.getAllBooks();
    }
    @PostMapping
    public void newBook(@RequestBody String title){
        service.addBook(title);
    }
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> emptyTitle(IllegalArgumentException e){
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
