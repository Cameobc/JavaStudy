package com.ch6;

public class CarTest3 {

    public static void main(String[] args) {
        Car3 c1 = new Car3();
        Car3 c2 = new Car3(c1);


        System.out.println("C1 color :: " + c1.color + ", gearType :: "+c1.gearType +", door :: "+c1.door);
        System.out.println("C2 color :: " + c2.color + ", gearType :: "+c2.gearType +", door :: "+c2.door);
        c1.door = 100;
        System.out.println("c1.door ::: ");
        System.out.println("C1 color :: " + c1.color + ", gearType :: "+c1.gearType +", door :: "+c1.door);
        System.out.println("C2 color :: " + c2.color + ", gearType :: "+c2.gearType +", door :: "+c2.door);
    }
}
