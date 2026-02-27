package main;

import beans.Car;
import beans.Gentleman;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[]args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        /*Person p = context.getBean(Person.class);
        System.out.println("Name: "+p.getName()+"\nCar: "+p.getMoto());*/

        Gentleman g = context.getBean(Gentleman.class);
        System.out.println("Name: "+g.getName()+"\nCar: "+g.getCar());

    }
}
