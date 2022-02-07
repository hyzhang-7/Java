package com.hspedu.object_;

public class EqualsExercise_02 {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.name = "edu";

        Human h2 = new Human();
        h2.name = "edu";

        System.out.println(h1 == h2); //false，是否是同一个对象
        System.out.println(h1.name.equals(h2.name)); //true，两个属性值是否相同
        System.out.println(h1.equals(h2)); //false，是否是同一个对象

        System.out.println("==================");

        String s1 = new String("abc");
        String s2 = new String("abc");

        System.out.println(s1.equals(s2)); //true，Object类的equals已经被String重写了，两个属性值是否相同
        System.out.println(s1 == s2); //false，是否是同一个对象
    }
}

class Human {
    public String name;
}