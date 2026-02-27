package main;

import beans.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.management.modelmbean.RequiredModelMBean;

@Component
public class Person {

    private String name = "Edgar";
    @Autowired(required = false)
    private Moto moto;

    public String getName(){
        return name;
    }
    public Moto getMoto(){
        return moto;
    }
}
