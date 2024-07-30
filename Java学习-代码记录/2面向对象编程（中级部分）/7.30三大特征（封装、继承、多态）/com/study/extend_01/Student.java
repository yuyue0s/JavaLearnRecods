package com.study.extend_01;

//父类 Pupil 和 Graduate
public class Student {
    //共有的属性
    public String name;
    public int age;
    private double score;
    //共有的方法
    public void setScore(double score) {
        this.score = score;
    }
     public void showInfo() {
         System.out.println("name="+ name + " age="+ age + " score="+score);
     }
}
