package com.hspedu.modifier;

public class B {
    public void say() {
        A a = new A();
        //同一个包下，可以访问public、protected、和默认修饰符，不能访问private
        System.out.println(a.n1 + a.n2 + a.n3);
    }
}
