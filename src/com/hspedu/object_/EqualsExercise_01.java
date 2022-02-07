package com.hspedu.object_;

public class EqualsExercise_01 {
    public static void main(String[] args) {
        Person p1 = new Person("jack", 10, '男');
        Person p2 = new Person("jack", 10, '男');

        System.out.println(p1.equals(p2)); //false，使用的是Object的equals方法，及判断是否是同一个对象
        System.out.println(p1.equals_(p2)); //true
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    //重写equals方法，判断两个Person对象的内容是否相等
    //a.equals_(b)，下面的obj就是这里的b，this指的是这里的a
    public boolean equals_(Object obj) {
        //判断如果比较的两个对象是同一个对象，则直接返回true
        if (this == obj) {
            return true;
        }
        //类型判断
        if (obj instanceof Person) { //是Person才继续比较
            //进行向下转型，因为需要得到obj的各个属性
            Person p = (Person) obj;
            //这里的equals是String类的equals，因为name是字符串
            //判断两个类的每个属性值是否相同
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        } else {
            return false;
        }
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}