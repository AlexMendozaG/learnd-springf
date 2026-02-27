package main;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String kind = "Bird";


    @Override
    public String toString() {
        return "Parrot [kind=" + kind + "]";
    }
}
