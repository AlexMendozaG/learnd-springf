package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gentleman {

    private String name = "Alexander";
    private final Car car;

    @Autowired
    public Gentleman(Car car){
        this.car=car;
    }

    public String getName(){
        return name;
    }
    public Car getCar(){
        return car;
    }

}
