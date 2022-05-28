package com.ch11;

import java.util.HashSet;

public class HashSetEx03 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person03("David", 10));
        set.add(new Person03("David", 10));

        System.out.println(set);
    }
}

class Person03{
    String name;
    int age;

    public Person03(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person04{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
