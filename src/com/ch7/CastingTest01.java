package com.ch7;

public class CastingTest01 {
    public static void main(String[] args) {
        CastingCar car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
        // car.water(); 사용불가 컴파일에러
        fe2 = (FireEngine) car;
        fe2.water();

        CastingCar car1 = new CastingCar();
        CastingCar car2 = null;
        FireEngine fe3 = null;

        car1.drive();
        fe3 = (FireEngine) car;
        fe3.drive();
        fe3.water();
        car2 = fe3;
        car2.drive();
    }
}

class CastingCar{
    String color;
    int door;

    void drive(){
        System.out.println("drive");
    }

    void stop(){
        System.out.println("stop");
    }
}

class FireEngine extends CastingCar {
    void water(){
        System.out.println("water");
    }
}
