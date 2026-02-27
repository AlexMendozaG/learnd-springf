package main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component
public class Person {

    private String name;

    /*public Person() {}
    public void setName(String name){this.name=name;}*/
    public String getName(){return name;}

    //@PostConstruct
    public void init(){
        this.name = "edgar";
    }
}
