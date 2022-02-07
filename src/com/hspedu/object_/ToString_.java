package com.hspedu.object_;

public class ToString_ {
    public static void main(String[] args) {
        //Object类中toString方法
        //getClass().getName()返回报名和类名
        //Integer.toHexString(hashCode())将对象的hashCode值转成16进制字符串
//        public String toString() {
//            return getClass().getName() + "@" + Integer.toHexString(hashCode());
//        }
        Monster m = new Monster("jack", 17);
        System.out.println(m.toString());
        //当属出一个对象时，就会默认调用toString方法
        System.out.println(m);

    }
}

class Monster {
    private String name;
    private int age;

    public Monster(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //重写toString方法，输出对象的属性
    //使用快捷键command+n
    @Override
    public String toString() { //重写后一般是把对象的属性值输出，当然程序员也可以自己定制
        return "Monster{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
