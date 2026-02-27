package config;

import main.Car;
import main.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Car car1() {
        Car car = new Car();
        car.setBrand("Nissan");
        return car;
    }
    @Bean
    public Car car2() {
        Car car = new Car();
        car.setBrand("Toyota");
        return car;
    }
    @Bean
    public Car car3() {
        Car car = new Car();
        car.setBrand("Kia");
        return car;
    }

    @Bean
    public Person person1() {
        Person p = new Person();
        p.setFirstName("Edgar");
        p.setCar(car1());
        return p;
    }
    @Bean
    public Person person2(@Qualifier("car2") Car car) {
        Person p = new Person();
        p.setFirstName("Josue");
        p.setCar(car);
        return p;
    }
}
