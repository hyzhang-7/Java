package com.hspedu.object_;

public class Finalize_ {
    public static void main(String[] args) {
        Car c = new Car("宝马");
        c = null; //此时Car()变成了垃圾，垃圾回收器就会销毁对象，
        //在销毁对象前，会调用该对象的finalize方法，程序员就可以在finalize方法中写自己的业务代码(比如师范资源、数据库连接)
        //如果程序员不重写finalize，就会调用Object类的finalize，即默认处理

        System.gc(); //主动调用垃圾回收器
        System.out.println("程序退出");
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }
    //重写finalize
    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁汽车" + name);
    }
}