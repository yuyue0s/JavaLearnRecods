package com.study.polymorphic.polyparameter;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println(getName() + "Worker~work^o^");
    }
    public double getAnnual() {
        return 12 * getSalary();
    }
}
