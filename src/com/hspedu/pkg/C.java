package com.hspedu.pkg;

import com.hspedu.modifier.A;

public class C {
    public static void main(String[] args) {
        A a = new A();
        //在不同包下，只可以访问public修饰的属性或方法
        //但不能访问其他修饰符
        System.out.println(a.n1);
    }
}
