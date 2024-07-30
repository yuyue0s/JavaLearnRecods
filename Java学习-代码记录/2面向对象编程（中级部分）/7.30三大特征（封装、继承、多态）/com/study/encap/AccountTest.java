package com.study.encap;

/**
 * 创建程序,在其中定义两个类:Account和 AccountTest 类体会Java的封装性
 * 1.Account类要求具有属性:姓名(长度为2位3位或4位)、余额(必须>20),密码(必须是六位)，
 * 2.如果不满足，则给出提示信息，并给默认值(程序员自己定)通过setXxx的方法给 Account 的属性赋值
 * 3.在AccountTest中测试
 */
public class AccountTest {
    public static void main(String[] args) {
        //在AccountTest中测试
        System.out.println("=====第1个====");
        new Account("悦悦悦悦悦",0,"1234567");
        System.out.println("=====第2个====");
        Account test2 = new Account("悦悦总",100,"123456");
        test2.getBalance("123");
        System.out.println(test2.getBalance("123456"));
    }
}
class Account{
    private String name;
    private double balance;
    private String password;

    public Account() {
    }

    public Account(String name, double balance, String password) {
        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4){
            this.name = name;
        }else {
            System.out.println("名字长度不对，长度为2位3位或4位");
            this.name = "无";
        }

    }

    public double getBalance(String password) {
        if (password.equals(this.password)){
            System.out.println("密码正确");
            return balance;
        }else {
            System.out.println("密码错误");
            return -1;
        }
    }

    public void setBalance(double balance) {
        if (balance > 20){
            this.balance = balance;
        }else {
            System.out.println("余额必须大于20");
            this.balance = 21;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6){
            this.password = password;
        }else {
            System.out.println("密码长度必须是六位");
            this.password = "123456";
        }
    }
}