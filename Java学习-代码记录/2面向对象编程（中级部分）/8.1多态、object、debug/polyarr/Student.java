package com.study.polymorphic.polyarr;

public class Student extends Person{
    private double score;

    //特有的方法
    public void study(){
        System.out.println("study~o^o");
    }

    public String say() {
        return super.say() + " " + score;
    }

    public Student(int age, String name, double score) {
        super(age, name);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
