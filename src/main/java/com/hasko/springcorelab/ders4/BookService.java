package com.hasko.springcorelab.ders4;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository repository ;
    public BookService(BookRepository repository){
        this.repository = repository;
    }
    public List<String> getAllBooks(){
        return repository.findAll();
    }
    public void addBook(String title){
        if(title == null || title.isBlank()) throw new IllegalArgumentException("Kitap adi bos olamaz");
        else repository.save(title);
    }

}
