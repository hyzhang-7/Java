package com.hspedu.extends_.Extends01;
//大学生->模拟大学生的考试情况
public class Graduate {
    public String name;
    public int age;
    public double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void testing() {
        System.out.println("大学生" + name + " 正在考大学数学..");
    }
    public void showInfo() {
        System.out.println("姓名" + name + " 年龄" + age + " 成绩" + score);
    }
}
