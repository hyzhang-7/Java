package com.hspedu.super_;

public class Super01 {
    public static void main(String[] args) {
        B b = new B();
        b.sum();
    }
}

class A {
    //4个属性和4个方法
    public int n1 = 1;
    protected int n2 = 2;
    int n3 = 3;
    private int n4 = 4;

    public void test1() {
    }
    protected void test2() {
    }
    void test3() {
    }
    private void test4() {
    }

    public void cal() {
        System.out.println("父类A的方法cal");
    }
}

class B extends A {
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }

    public void hello() {
        super.test1();
        super.test2();
        super.test3();
        //super.test4(); //test4是私有的不能访问
    }

    public void cal() {
        System.out.println("子类B的方法cal");
    }

    public void sum() {
        System.out.println("子类B的方法sum");
        cal();
        this.cal();
        super.cal();
        //cal()和this.cal()完全等价，即现在本类中找cal方法，如果找到了且能调用就执行该方法，否则再从父类中招，依次类推
        //super.cal()，是直接跳过本类在父类中寻找cal方法
    }
}











