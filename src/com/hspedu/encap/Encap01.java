package com.hspedu.encap;

public class Encap01 {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setName("jack"); //把jack传给了name，谁调用就传给谁
//        person.setAge(300);
//        person.setSalary(20000);
//        System.out.println(person.info());
        //使用构造器
        Person smith = new Person("smith", 140, 20000);
        System.out.println(smith.info());

    }
}

//不能随便查看人的年龄、工资等隐私，并对设置的年龄进行合理的验证。合理就设置，否则给默认
//年龄必须在1-120，年龄和工资不能直接查看，name的长度在2-6字符之间
class Person {
    public String name;
    private int age;
    private double salary;
//封装的实现步骤(三步)
//1.将属性进行私有化，
//2.提供一个公共的set方法，用于对属性判断并赋值，
//3.提供一个公共的get方法，用于获取某属性的值，
//快捷方式，右键+generate
//根据要求完善代码

    //定义构造器
    public Person() {
    }

    public Person(String name, int age, double salary) {
        setName(name); //等价于this.setName(name)
        setAge(age);
        setSalary(salary);
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
        if (age >= 1 & age <= 120) {
            this.age = age;
        } else {
            System.out.println("the age is not allowed，so use default");
            this.age = 30; //给一个默认年龄
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //定义一个方法用于返回信息
    public String info() {
        return "info: name: " + name + " age: " + age + " salary: " + salary;
    }
}























