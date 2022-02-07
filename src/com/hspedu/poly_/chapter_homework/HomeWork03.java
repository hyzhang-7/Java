package com.hspedu.poly_.chapter_homework;

public class HomeWork03 {
    public static void main(String[] args) {
        Professor p = new Professor("zhy", 22, "教授", 20000, 1.3);
        p.introduce();
    }
}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;
    private double grade;

    public Teacher(String name, int age, String post, double salary, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }

    public void introduce() {
        System.out.println("姓名: " + name + " 年龄: " + age + " 职称: " +
                post + " 基本工资: " + salary + " 级别: " + grade);
    }
}

class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        System.out.println("子类");
        super.introduce();
    }
}