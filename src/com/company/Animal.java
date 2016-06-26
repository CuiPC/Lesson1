package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Cui on 16/6/26.
 */
public class Animal {
    private String name;
    private  int age;

    public Animal(String name , int age){
        this.name=name;
        this.age=age;
    }

    public static  void main(String args[]){
        System.out.print("wwhwhwhhw");
        Animal a = new Animal("hahha",14);
        System.out.println("This animal's name is "+a.getName()+" ,and the age is "+a.getAge());


    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
