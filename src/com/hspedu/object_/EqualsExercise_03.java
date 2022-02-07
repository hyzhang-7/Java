package com.hspedu.object_;

public class EqualsExercise_03 {
    public static void main(String[] args) {
        int it = 65;
        float fl = 65.0f;
        System.out.println("65和65.0f是否相等? " + (it == fl)); //true，判断值是否相等

        char ch1 = 'A';
        char ch2 = 12;
        System.out.println("65和A是否相等? " + (it == ch1)); //true，判断值是否相等
        System.out.println("12和ch2是否相等? " + (12 == ch2)); //true，判断值是否相等

        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("str1是否和str2相等" + (str1 == str2)); //false，是否是同一个对象
        System.out.println("str1是否equals str2" + (str1.equals(str2))); //true，Object类的equals已经被String重写了，两个属性值是否相同

        // System.out.println("hello" == new java.sql.Date()); //编译错误，不是同一个类型不能比较
    }
}
