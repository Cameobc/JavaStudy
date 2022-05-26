package com.ch6;

public class Car3 {
    String color;
    String gearType;
    int door;

    public Car3() {
        this("whtie", "auto", 4);
    }

    public Car3(Car3 car) {
        this.color = car.color;
        this.gearType = car.gearType;
        this.door = car.door;
    }

    public Car3(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
