package com.ch6;

public class DocumnentTest {

    static int count = 0;
    String name;

    DocumnentTest(){
        this("noname" + ++count);
    }

    public DocumnentTest(String name) {
        this.name = name;
        System.out.println("document :: " + this.name);
    }

    public static void main(String[] args) {
        DocumnentTest d1 = new DocumnentTest();
        DocumnentTest d2 = new DocumnentTest("자바.txt");
        DocumnentTest d3 = new DocumnentTest();
        DocumnentTest d4 = new DocumnentTest();
    }
}
