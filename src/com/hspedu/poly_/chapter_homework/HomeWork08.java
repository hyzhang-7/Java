package com.hspedu.poly_.chapter_homework;

public class HomeWork08 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(100);
//        System.out.println(checkingAccount.getBalance());
//        checkingAccount.withdraw(100);
//        System.out.println(checkingAccount.getBalance());
        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());

        //使用定时器自动执行earnMonthlyInterest
        savingAccount.earnMonthlyInterest();
        System.out.println(savingAccount.getBalance());

    }
}

class BankAccount {
    private double balance;

    public BankAccount(double Initialbalance) {
        this.balance = Initialbalance;
    }

    public void deposit(double amount) { //存
        balance += amount;
    }

    public void withdraw(double amount) { //取
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

/*
在上类的基础上扩展，新类CheckingAccount对每次存款和取款都收取1美元
 */

class CheckingAccount extends BankAccount {
    public CheckingAccount(double Initialbalance) {
        super(Initialbalance);
    }

    @Override
    public void deposit(double amount) { //假设存了100，就相当于存了99
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) { //假设取了100，就相当于取了101
        super.withdraw(amount + 1);
    }
}

/*
扩展BankAccount类，新类SavingAccount每个月都有利息产生，计算利息的方法为earnMonthlyInterest，
并且每月三次的免手续费的存款和取款，在earnMonthlyInterest中重置交易次数
 */

class SavingAccount extends BankAccount {
    public SavingAccount(double Initialbalance) {
        super(Initialbalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    private int count = 3;
    private double rate = 0.01;

    public void earnMonthlyInterest() {//每月月初统计上月的利息，并重设免手续费的次数
        count = 3;
        super.deposit(getBalance() * rate);
    }

    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;
    }
}