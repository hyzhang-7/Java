package com.hspedu.encap;

/*
创建程序，定义两个类，Account和AccountTest
Account类要求具有属性：姓名(长度为2位或3位或4位)、余额(必须>20)，密码必须是六位
如不满足，则给出提示信息，并给默认值
通多setXxx方法给Account属性赋值
在AccountTest中测试
 */
public class Account {
    //为了封装，将3个属性设置为private
    private String name;
    private double balance;
    private String pwd;

    public Account() { //无参构造器
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4){
            this.name = name;
        } else {
            System.out.println("名字长度不符合要求，使用默认值");
            this.name = "jack";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 20) {
            this.balance = balance;
        } else{
            System.out.println("balance需要大于20，使用默认值");
            this.balance = 1;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if(pwd.length() == 6) {
            this.pwd = pwd;
        } else{
            System.out.println("密码长度不符合规范，使用默认值");
            this.pwd = "000000";
        }
    }

    //显示账号信息
    public void info(){
        System.out.println("info: name " + name + " balance " + balance + " pwd " + pwd);
    }
}


