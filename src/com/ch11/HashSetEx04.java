package com.ch11;

import java.util.HashSet;
import java.util.Objects;

public class HashSetEx04 {

    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person04("David", 10));
        set.add(new Person04("David", 10));

        System.out.println(set);
    }
}
class Person04 {
    String name;
    int age;

    public Person04(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        if (obj instanceof Person04) {
            Person04 tmp = (Person04) obj;
            return name.equals(tmp.name) && age == tmp.age;
        }
        return false;
    }

    public int hashCode(){
//        return (name + age).hashCode();
        return Objects.hash(name, age);
    }


    @Override
    public String toString() {
        return "Person04{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
