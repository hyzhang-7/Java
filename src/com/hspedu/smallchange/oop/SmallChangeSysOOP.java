package com.hspedu.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
该类是完成零钱通的各个功能的类
使用面向变成对象的方法
每个功能对应一个方法
 */
public class SmallChangeSysOOP {

    //定义相关变量
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    String details = "---零钱通明细---";

    //定义收益入账的相关变量
    double money = 0;
    double balance = 0; //余额
    Date date = null; //date是java.util.Date类型，表示日期
    //可以用于格式化日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //定义消费的相关变量2
    String note = "";

    //主菜单
    public void mainMenu() {
        do {

            System.out.println("\n=======零钱通菜单OOP=======");
            System.out.println("\t\t1.零钱通明细");
            System.out.println("\t\t2.收益入账");
            System.out.println("\t\t3.消费");
            System.out.println("\t\t4.退出");

            System.out.println("请选择(1-4)");
            key = scanner.next();

            //使用switch分支控制
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新输入");
            }
        } while (loop);
        System.out.println("已退出零钱通");
    }

    //零钱通明细
    public void detail() {
        System.out.println(details);
    }

    //收益入账
    public void income() {
        System.out.println("收益入账金额为: ");
        money = scanner.nextDouble();
        //找出不正确的金额条件，然后给出提示，就直接return
        if (money <= 0) {
            System.out.println("收益入账金额需要大于0");
            return; //不再执行后面的代码
        }
        balance = balance + money;
        date = new Date(); //获取当前时间
        //拼接入账信息到details
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + "余额 " + balance;
    }

    //消费
    public void pay() {
        System.out.println("消费金额: ");
        money = scanner.nextDouble();
        //找出不正确的金额条件，然后给出提示，就直接return
        if (money > balance || money <= 0) {
            System.out.println("消费金额应在0-" + balance);
            return;
        }
        System.out.println("请输入消费场所: ");
        note = scanner.next();
        date = new Date(); //获取当前时间
        balance -= money;
        //拼接消费信息到details
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + "余额 " + balance;
    }

    //退出
    public void exit() {
        //用户输入4时，给出提示"你确定要退出吗 y/n"，必须是如正确的y或n
        //否则循环输入指令，直到输入y或n
        String choice = "";
        while (true) {
            System.out.println("你确定要退出吗 y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        //当用户退出循环时，进行判断
        if (choice == "y") {
            loop = false;
        }
    }
}
