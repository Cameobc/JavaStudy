package com.oop.ch6;

public class Test {

    public static void main(String[] args) {

    }

    static String concatenate(String delim, String... arg) {
        String result = "";
        for(String str : arg){
            result += str + delim;
        }
        return result;
    }
}
