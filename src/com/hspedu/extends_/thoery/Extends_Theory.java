package com.hspedu.extends_.thoery;

public class Extends_Theory {
    public static void main(String[] args) {
        Son son = new Son();
        //当不同类的属性重复时，要按照查找关系来返回信息
        //首先看子类是否有该属性，如果有并且可以访问，则返回信息
        //如果子类没有，就看父类，如果有并且可以访问，则返回信息
        //如果父类没有，继续找上级父类，直到Object
        System.out.println(son.getAge());
        System.out.println(son.name);
    }
}

class Grandpa {
    String name = "爷爷";
    String hobby = "旅游";
}

class Father extends Grandpa {
    String name = "爸爸";
    private int age = 36;
}

class Son extends Father {
    String name = "儿子";
    private int age = 17;

    public int getAge() {
        return age;
    }
}
