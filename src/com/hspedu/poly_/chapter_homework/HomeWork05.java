package com.hspedu.poly_.chapter_homework;

/*
父类员工类，子类为工人类、农民类、教师类、科学家类，工人、农民只有基本工资，
教师除了基本工资还有课酬(元/天)，科学家除了基本工资，还有年终奖
 */
public class HomeWork05 {
    public static void main(String[] args) {
        Worker zhy = new Worker("zhy", 10000);
        zhy.info();

        Teacher1 lz = new Teacher1("lz", 20000);
        lz.setClass_salary(2000);
        lz.info();

    }
}

class Employee1 {
    private String name;
    private double base_salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBase_salary() {
        return base_salary;
    }

    public void setBase_salary(double base_salary) {
        this.base_salary = base_salary;
    }

    public Employee1(String name, double base_salary) {
        this.name = name;
        this.base_salary = base_salary;
    }

    public void info() {
        System.out.println("员工 " + name + " 的工资为 " + base_salary);
    }
}

class Worker extends Employee1 {
    public Worker(String name, double base_salary) {
        super(name, base_salary);
    }

    @Override
    public void info() {
        System.out.println("工人");
        super.info();
    }
}

class Teacher1 extends Employee1 {
    private double class_salary;

    public Teacher1(String name, double base_salary) {
        super(name, base_salary);
    }

    public double getClass_salary() {
        return class_salary;
    }

    public void setClass_salary(double class_salary) {
        this.class_salary = class_salary;
    }

    @Override
    public void info() {
        System.out.println("老师");
        System.out.println("员工 " + getName() + " 的工资为 "
                + (class_salary + getBase_salary()));
    }
}