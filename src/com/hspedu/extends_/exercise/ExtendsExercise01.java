package com.hspedu.extends_.exercise;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        B1 b = new B1();
    }
}

class A1 {
    A1() { //无参构造器
        System.out.println("a");
    }

    A1(String name) {
        System.out.println("a name");
    }
}

class B1 extends A1 {
    B1() {
        this("abc"); //this会调用本类中带参数的构造器
        System.out.println("b");
    }

    B1(String name) {
        System.out.println("b name");
    }
}