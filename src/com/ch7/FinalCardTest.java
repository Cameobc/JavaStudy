package com.ch7;

public class FinalCardTest {
    public static void main(String[] args) {
        FinalCard c = new FinalCard(10, "HEART");
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}

class FinalCard {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    public FinalCard(int NUMBER, String KIND) {
        this.NUMBER = NUMBER;
        this.KIND = KIND;
    }

    FinalCard(){
        this(1, "HEART");
    }

    @Override
    public String toString() {
        return KIND + " " + NUMBER;
    }
}
