package com.samllchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        //1.先完成基本菜单 可以用do while 是先显示一编的菜单;loop是循环的意思
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        int key;
        //2.完成零钱通明细
        /**
         * 方法1：可以把消费和收益保存在数组
         * 方法2：可以创建一个对象
         * 方法3：直接用字符串拼接
         */
        String details = "------------零钱通明细------------";
        //3.完成收益入账
        double income = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        //4.完成消费入账
        double money = 0;//消费金额
        String reason = "";//消费说明

        do{
            System.out.println("\n===========零钱通菜单==========");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退出零钱通");
            System.out.println("请输入1-4选择查看");
            key = scanner.nextInt();

            //使用switch 分支控制
            switch (key){
                case 1:
                    System.out.print(details);
                    break;
                case 2:
                    System.out.println("请输入收益金额");
                    income = scanner.nextDouble();
                    //income的值应该校验 判断金额是否合理 不可以收入-100
                    //可以找不正确的金额 给出提示 直接break
                    if (income <= 0){
                        System.out.println("收益金额应该大于0");
                        break;
                    }
                    balance += income;
                    date = new Date();
                    details += "\n收益入账\t+" + income + "\t" + sdf.format(date) +"\t余额:" + balance;
                    //相当于details = details + "\n收益入账\t+" + income + "\t余额:" + balance;
                    break;
                case 3:
                    System.out.println("请输入消费金额");
                    money = scanner.nextDouble();
                    //money的值应该校验 判断金额是否合理
                    if (money > balance || money <= 0 ){
                        System.out.println("余额不足");
                        break;
                    }

                    System.out.println("请输入消费说明");
                    reason = scanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + reason + "\t\t-" + money + "\t" + sdf.format(date) +"\t余额:" + balance;
                    break;
                case 4:
                    String choice = "";//选择
                    //输入y/n来进一步判断是否退出
                    while (true){ //死循环
                        System.out.println("请输入y/n来确定是否退出");
                        choice = scanner.next();
                        if (choice.equals("y") || choice.equals("n")){
                            break;
                        }
                        System.out.println("输入有误");
                    }
                    if (choice.equals("y")){
                        loop = false;
                        System.out.println("退出零钱通");
                    }
                    //建议一段代码完成一个功能 不要混在一起
                    break;
                default:
                    System.out.println("输入有误");
            }
        }while (loop);
    }
}
