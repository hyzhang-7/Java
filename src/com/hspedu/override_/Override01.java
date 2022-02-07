package com.hspedu.override_;

public class Override01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.cry();
    }
}

class Animal {
    public void cry() {
        System.out.println("动物交换..");
    }
}

class Dog extends Animal {
    @Override
    public void cry() {
        System.out.println("小狗叫唤...");
    }
}