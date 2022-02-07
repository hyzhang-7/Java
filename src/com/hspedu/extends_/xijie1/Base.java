package com.hspedu.extends_.xijie1;

public class Base {
    public int n1 = 1;
    protected int n2 = 2;
    int n3 = 3;
    private int n4 = 4;

    public Base() { //无参构造器
        System.out.println("父类的无参构造器");
    }

    public Base(int n1) {
        System.out.println("父类的有参构造器");
    }

    public int getN4() {
        return n4;
    }

    public void test1() {
        System.out.println("test1");
    }

    protected void test2() {
        System.out.println("test2");
    }

    void test3() {
        System.out.println("test3");
    }

    private void test4() {
        System.out.println("test4");
    }

    public void call_test4() {
        test4();
    }
}
