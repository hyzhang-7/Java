package com.hspedu.poly_.xijie;

public class Animal {
    public static void main(String[] args) {
        Base base  = new Sub();
        System.out.println(base.count);

        base.say();
    }
}

class Base {
    int count = 10;
    public void say() {
        System.out.println("父类");
    }
}

class Sub extends Base {
    int count = 20;
    public void say() {
        System.out.println("子类");
    }
}