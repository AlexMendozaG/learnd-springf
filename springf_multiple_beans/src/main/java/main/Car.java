package main;

public class Car {
    private String brand;
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand;
    }
}
