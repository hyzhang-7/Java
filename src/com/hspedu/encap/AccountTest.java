package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        //创建Account
//       使用空构造器
//       Account account = new Account();
//       account.setName("zhanghuanyi");
//       account.setBalance(120);
//       account.setPwd("123");
//       account.info();

//      使用有参数的构造器
        Account account = new Account("zhan",122,"120000");
        account.info();
    }
}

