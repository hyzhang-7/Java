package com.hspedu.extends_.Extends01_improve;
//Student作为父类
public class Student {
    public String name;
    public int age;
    public double score;

    public void showInfo() {
        System.out.println("姓名" + name + " 年龄" + age + " 成绩" + score);
    }
    public void setScore(double score) {
        this.score = score;
    }
}
