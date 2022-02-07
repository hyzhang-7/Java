package com.hspedu.extends_.Extends01_improve;

public class Extends01_improve {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "Jack-";
        pupil.age = 10;

        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        System.out.println("---------------");
        System.out.println("---------------");

        Graduate graduate = new Graduate();
        graduate.name = "Tom-";
        graduate.age = 22;

        graduate.testing();
        graduate.setScore(99);
        graduate.showInfo();
    }
}
