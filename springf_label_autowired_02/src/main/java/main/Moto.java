package main;

import org.springframework.stereotype.Component;

@Component
public class Moto {
    private String placa = "p89-20B";
    public String getPlaca(){
        return placa;
    }
    public String toString(){
        return "Placa: "+getPlaca();
    }
}
