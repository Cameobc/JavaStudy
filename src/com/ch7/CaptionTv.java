package com.ch7;

public class CaptionTv extends Tv{
    boolean caption;
    void displayCation(String text){
        if(caption){
            System.out.println(text);
        }
    }
}
