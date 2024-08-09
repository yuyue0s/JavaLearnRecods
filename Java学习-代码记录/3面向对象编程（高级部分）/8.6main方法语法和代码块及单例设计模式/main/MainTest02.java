package com.main;

public class MainTest02 {

    public static void main(String[] args) {
        //在idea中如何传参数 右上角编辑配置-程序实参
        for (int i = 0; i < args.length;i++) {
            System.out.println(args[i] + i);
        }

    }
}
