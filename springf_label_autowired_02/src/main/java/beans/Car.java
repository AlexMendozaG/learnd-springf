package beans;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String placa = "P89-20B";

    public String getPlaca(){
        return placa;
    }
    public String toString(){
        return "Placa: "+getPlaca();
    }
}
