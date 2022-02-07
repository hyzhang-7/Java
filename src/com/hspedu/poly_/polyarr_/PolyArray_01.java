package com.hspedu.poly_.polyarr_;

public class PolyArray_01 {
    public static void main(String[] args) {
        //应用实例：现有一个继承结构如下：要求创建一个Person对象
        //2个Student对象和2个Teacher对象，统一放在数组中，并调用每个对象的say方法
        //这是多多态数组
        Person[] persons = new Person[5];
        persons[0] = new Person("Jack", 17);
        persons[1] = new Student("Bob", 18, 97);
        persons[2] = new Student("Tom", 22, 88);
        persons[3] = new Teacher("Lily", 31, 18000);
        persons[4] = new Teacher("Rose", 44, 9000);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say()); //动态绑定机制
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public String say() {
        return "name: " + name + " age: " + age;
    }
}

class Student extends Person {
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return "学生: " + super.say() + " score: " + score;
    }
}

class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return "老师: " + super.say() + " salary: " + salary;
    }
}
