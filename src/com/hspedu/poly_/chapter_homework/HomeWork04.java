package com.hspedu.poly_.chapter_homework;

//父类为员工类，子类为经理类和普通员工类，
//部门经理工资为1000+单日工资*天数*等级
//员工属性为姓名、单日工资、天数、等级，员工的方法有打印工资
//子类需要重写打印方法

public class HomeWork04 {
    public static void main(String[] args) {
        Manager zhy = new Manager("zhy", 400, 25, 1.2);
        zhy.setBonus(10000);
        zhy.info();

    }
}

class Employee {
    private String name;
    private double salary_per_day;
    private double days;
    private double grade;

    public Employee(String name, double salary_per_day, double days, double grade) {
        this.name = name;
        this.salary_per_day = salary_per_day;
        this.days = days;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary_per_day() {
        return salary_per_day;
    }

    public void setSalary_per_day(double salary_per_day) {
        this.salary_per_day = salary_per_day;
    }

    public double getDays() {
        return days;
    }

    public void setDays(double days) {
        this.days = days;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void info() {
        System.out.println("员工 " + name + " 的工资为 " + salary_per_day * days * grade);
    }
}

class Manager extends Employee {
    //特有属性
    private double bonus;
    //创建manager对象时，奖金是多少并不是确定的，所以在构造器中不给bonus，可以通过setBouns设置
    public Manager(String name, double salary_per_day, double days, double grade) {
        super(name, salary_per_day, days, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void info() {
        System.out.println("经理 " + getName() + " 的工资为 " + (bonus
                + getSalary_per_day() * getDays() * getGrade()));
    }
}