package com.hspedu.override_;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("tom", 18);
        Student student = new Student("jack", 17, 1020, 97);
        System.out.println(person.say());
        System.out.println(student.say());
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
        return "姓名: " + name + " 年龄: " + age;
    }
}

class Student extends Person {
    private int id;
    private double score;

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say() {
        return super.say() + " id: " + id + " score: " + score;
    }
}