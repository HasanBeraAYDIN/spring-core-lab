package com.hasko.springcorelab.ders4;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class BookRepository {
    private final List<String> books = new ArrayList<>();
    public BookRepository(){
        books.add("book 1");
        books.add("book 2");
    }
    public List<String> findAll(){
        return Collections.unmodifiableList(books);
    }
    public void save(String title){
        books.add(title);
    }
}
