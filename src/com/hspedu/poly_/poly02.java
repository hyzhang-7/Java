package com.hspedu.poly_;

public class poly02 {
    public static void main(String[] args) {
        Master1 master = new Master1("张桓屹");
        Dog1 dog = new Dog1("dog");
        Bone1 bone = new Bone1("骨头");
        master.feed(dog, bone);
    }
}

class Animal1 {
    private String name;

    public Animal1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog1 extends Animal1 {
    public Dog1(String name) {
        super(name);
    }
}

class Food1 {
    private String name;

    public Food1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Bone1 extends Food1 {
    public Bone1(String name) {
        super(name);
    }
}

class Master1 {
    private String name;

    public Master1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void feed(Animal1 animal1,Food1 food1) {
        System.out.println("主人" + name + "给" + animal1.getName() + "吃" + food1.getName());
    }
}