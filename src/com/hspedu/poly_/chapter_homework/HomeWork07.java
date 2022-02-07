package com.hspedu.poly_.chapter_homework;

public class HomeWork07 {
    public static void main(String[] args) {
        new Demo().test();
        System.out.println("==========");
        new Demo("John").test();
    }
}

class Test {
    String name = "Rose";

    Test() {
        System.out.println("Test");
    }

    Test(String name) { //john
        this.name = name; //把父类的name修改为john
    }
}

class Demo extends Test {
    String name="Jack";
    Demo(){
        super();
        System.out.println("Demo");
    }
    Demo(String s){
        super(s); //

    }
    public void test(){
        System.out.println(super.name);
        System.out.println(this.name);
    }
}