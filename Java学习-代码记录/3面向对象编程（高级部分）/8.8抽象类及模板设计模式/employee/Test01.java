package com.study.abstrcat_.employee;

public class Test01 {
    public static void main(String[] args) {
        Manager xq = new Manager("小晴","0831",100);
        xq.setBonus(100);
        xq.work();

        CommonEmployee xy = new CommonEmployee("小于","0615",100);
        xy.work();
    }
}
