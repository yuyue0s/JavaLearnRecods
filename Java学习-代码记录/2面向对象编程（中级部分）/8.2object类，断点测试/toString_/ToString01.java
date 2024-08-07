package com.study.toString_;

public class ToString01 {
    public static void main(String[] args) {
        Monster monster = new Monster("小晴","陪悦总");
        System.out.println(monster.toString());
        //默认返回：全类名+@+哈希值的十六进制 【查看Object 的toString 方法】
        //子类往往重写toString 方法，用于返回对象的属性信息

        System.out.println("===当直接输出一个对象时， toString 方法会被默认的调用===");
        System.out.println(monster + " " +monster.hashCode());
    }
}
class Monster{
    private String name;
    private String job;
    public Monster(String name,String job){
       this.name = name;
       this.job = job;
    }
    //重写toString 方法，打印对象或拼接对象时，都会自动调用该对象的toString 形式
    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
