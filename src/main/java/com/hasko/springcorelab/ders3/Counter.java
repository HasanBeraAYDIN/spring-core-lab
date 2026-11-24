package com.hasko.springcorelab.ders3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component
public class Counter {
    private int count;
    public Counter(){
        count = 0 ;
    }
    public int increment(){
        return ++count;
    }
}
