package com.hspedu.poly_.polyparameter_;
/*
定义员工类Employee，包含姓名和月工资，以及计算年薪的方法getAnnual，
普通员工和经理继承员工类，经理类多了bonus属性和管理方法manage，普通员工类多了work方法，
普通员工和经理类都要求重写getAnnual方法，
测试类中添加一个方法showEmpAnnual(Employee e)，实现获取员工的年薪，并在主方法中调用，
测试类中添加一个方法testWork，如果是普通员工则调用work方法，如果是经理，则调用manage方法
 */
public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("Tom", 5000);
        Manager bob = new Manager("Bob", 10000, 150000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        System.out.println("----------");
        System.out.println(tom.getAnnual());
        System.out.println("----------");
        polyParameter.testWork(tom);
    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Worker) { //判断e的运行类型是不是Worker
            ((Worker) e).work(); //向下转型
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        }
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    //计算年薪
    public double getAnnual() {
        return 12 * salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Worker extends Employee {
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("员工 " + getName() + " 正在工作...");
    }

    @Override
    public double getAnnual() { //重写获取年薪的方法
        return super.getAnnual();
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("经理" + getName() + " 正在管理...");
    }

    @Override
    public double getAnnual() { //重写获取年薪的方法
        return super.getAnnual() + bonus;
    }
}