package com.study.polymorphic.polyparameter;

public class Employee {
    private String name;
    private double salary;
    //年工资
    public double getAnnual() {
        return 12 * getSalary();
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
