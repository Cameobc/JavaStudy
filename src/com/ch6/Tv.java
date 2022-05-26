package com.ch6;

public class Tv {

    // properties
    String color;
    boolean power;
    int channel;

    // function
    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }

}
class TvTest{
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println(" channel is "+t.channel);
    }
}
