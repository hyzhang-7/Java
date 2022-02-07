package com.hspedu.poly_.chapter_homework;

/*
定义一个Persons类{name,age,job},初始化Persons对象数组，
有三个Persons对象，并按照age从大到小进行排序，使用冒泡排序
 */
public class HomeWork01 {
    public static void main(String[] args) {
        Persons[] persons = new Persons[3];
        persons[0] = new Persons("Jack", 17, "worker");
        persons[1] = new Persons("Bob", 2, "teacher");
        persons[2] = new Persons("Li", 8, "coder");

        for(int i=0;i< persons.length;i++){
            System.out.println(persons[i].toString());
        }

        Persons temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if(persons[j].age<persons[j+1].age){
                    temp = persons[j];
                    persons[j]=persons[j+1];
                    persons[j+1]=temp;
                }
            }
        }
        System.out.println("========================");
        for(int i=0;i< persons.length;i++){
            System.out.println(persons[i].toString());
        }
    }
}

class Persons {
    String name;
    int age;
    String job;

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

    public Persons(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;


    }
}