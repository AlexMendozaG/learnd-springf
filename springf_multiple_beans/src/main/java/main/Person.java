package main;

public class Person {
    private String firstName;
    private Car car;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    public Car getCar() {
        return car;
    }
}
