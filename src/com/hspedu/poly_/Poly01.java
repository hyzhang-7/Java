package com.hspedu.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("张桓屹");
        Dog dog = new Dog("pet dog");
        Bone bone = new Bone("骨头");
        master.feed(dog, bone);

        System.out.println("================");

        Cat cat = new Cat("pet cat");
        Fish fish = new Fish("鱼");
        master.feed(cat, fish);

    }
}

class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Fish extends Food {
    public Fish(String name) {
        super(name);
    }
}

class Bone extends Food {
    public Bone(String name) {
        super(name);
    }
}

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

class Master {
    String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //使用多态可以统一的管理主人喂食的问题
    //animal编译类型是Animal,可以指向Animal子类的对象
    //food编译类型是Food,可以指向Food子类的对象
    public void feed(Animal animal, Food food) {
        System.out.println("主人" + name + "给" + animal.getName() + "吃" + food.getName());
    }
    //主人给动物喂食
    //public void feed(Dog dog,Bone bone) {
        //System.out.println("主人" + name + "给" + dog.getName() + "吃" + bone.getName());
//    }
}