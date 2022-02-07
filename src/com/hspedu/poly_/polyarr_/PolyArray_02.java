package com.hspedu.poly_.polyarr_;

public class PolyArray_02 {
    public static void main(String[] args) {
        //应用实例：现有一个继承结构如下：要求创建一个Person对象
        //2个Student对象和2个Teacher对象，统一放在数组中，并调用每个对象的say方法
        //这是多多态数组
        Person1[] persons = new Person1[5];
        persons[0] = new Person1("Jack", 17);
        persons[1] = new Student1("Bob", 18, 97);
        persons[2] = new Student1("Tom", 22, 88);
        persons[3] = new Teacher1("Lily", 31, 18000);
        persons[4] = new Teacher1("Rose", 44, 9000);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say()); //动态绑定机制

            if (persons[i] instanceof Student1) { //判断person[i]的运行类型是不是Student
                ((Student1) persons[i]).study();
                //也可以这样写
                //Student student = (Student)persons[i]; //向下转型
                //student.study();
            } else if (persons[i] instanceof Teacher1) {
                ((Teacher1) persons[i]).teach();
            } else {
                System.out.println("类型判断有误...");
            }
        }
    }
}


class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
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

class Student1 extends Person1 {
    private double score;

    public Student1(String name, int age, double score) {
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

    //特有方法
    public void study() {
        System.out.println("学生 " + getName() + "正在学习...");
    }
}

class Teacher1 extends Person1 {
    private double salary;

    public Teacher1(String name, int age, double salary) {
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

    //特有方法
    public void teach() {
        System.out.println("老师 " + getName() + "正在授课...");
    }
}
