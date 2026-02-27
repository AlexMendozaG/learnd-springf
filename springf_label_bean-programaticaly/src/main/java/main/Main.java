package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public  static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        List<Parrot> listParrot = new ArrayList<>();
        Parrot green = new Parrot();
        Parrot green2 = new Parrot();
        Parrot green3 = new Parrot();
        Parrot red = new Parrot();
        Parrot red2 = new Parrot();
        green.setColor("green");
        red.setColor("red");
        green2.setColor("green");
        red2.setColor("red");
        green3.setColor("green");

        listParrot.add(green);
        listParrot.add(green2);
        listParrot.add(green3);
        listParrot.add(red);
        listParrot.add(red2);

        //we say to the functional interface that print the value that we give it
        int cont = 0;
        for(int i = 0; i < listParrot.size(); i++ ){
            Parrot parrot = listParrot.get(i);
            if(parrot.getColor().equals("green")){
                Supplier<Parrot> parrotSupplier = () -> parrot;
                context.registerBean("parrot-green-"+i+"!", Parrot.class, parrotSupplier);
                cont++;
            }
        }

        for(int i = 0; i < cont; i++ ){
            Parrot parrot = context.getBean("parrot-green-"+i+"!", Parrot.class);
            System.out.println(parrot.getColor()+"-"+(i+1));
        }
        /*Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getColor());*/
    }
}
