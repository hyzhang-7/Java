package com.hspedu.object_;

public class Equals_01 {
    public static void main(String[] args) {
        C c1 = new C();
        C c2 = c1;
        C c3 = c2;
        System.out.println(c2 == c1); //true
        System.out.println(c3 == c1); //ture
        A ob = c1;
        System.out.println(ob == c3); //true

        System.out.println("----------------------");
        System.out.println("----------------------");

        Integer int1 = new Integer(1000);
        Integer int2 = new Integer(1000);
        System.out.println(int1 == int2); //false，判断是否是同一个对象
        System.out.println(int1.equals(int2)); //true，判断值是否相等

        System.out.println("----------------------");
        System.out.println("----------------------");

        String str1 = new String("asc");
        String str2 = new String("asc");
        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2)); //true
    }
}

class A { //父类
}

class C extends A { //子类
}
