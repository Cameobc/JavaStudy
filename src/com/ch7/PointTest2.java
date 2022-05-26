package com.ch7;

public class PointTest2 {
    public static void main(String[] args) {
        Point3D03 d03 = new Point3D03();
        System.out.println("d03.x = " + d03.x);
        System.out.println("d03.y = " + d03.y);
        System.out.println("d03.z = " + d03.z);
    }

}

class Point3{
    int x = 10;
    int y = 20;

    public Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D03 extends Point3 {
    int z = 30;

    public Point3D03() {
        this(100, 200, 300);
    }

    public Point3D03(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}