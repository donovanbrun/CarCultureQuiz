package fr.donovan.carculturquiz.model;

import org.springframework.data.annotation.Id;

public class Car {

    @Id
    private Long id;
    private String brand;
    private String model;
    private int year;
    private int power;

    public Car(String brand, String model, int year, int power) {
        this.id = ((Double) (Math.random() * Long.MAX_VALUE)).longValue();
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.power = power;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
