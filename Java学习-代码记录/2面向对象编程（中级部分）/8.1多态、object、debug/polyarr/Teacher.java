package com.study.polymorphic.polyarr;

public class Teacher extends Person {
    private double salary;

    public Teacher(int age, String name, double salary) {
        super(age, name);
        this.salary = salary;
    }

    public void teach() {
        System.out.println("teach~^o^");
    }

    public String say() {
        return super.say() + " " + salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
