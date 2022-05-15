package com.oop.ch6;

public class CarTest2 {

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        System.out.println("C1 color :: " + c1.color + ", gearType :: "+c1.gearType +", door :: "+c1.door);
        System.out.println("C2 color :: " + c2.color + ", gearType :: "+c2.gearType +", door :: "+c2.door);
    }
}
