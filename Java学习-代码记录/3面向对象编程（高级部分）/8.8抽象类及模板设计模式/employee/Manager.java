package com.study.abstrcat_.employee;

public class Manager extends Employee{
    private double bonus;
    public Manager(String name,String id,double salary){
        super(name, id, salary);
    }
    public void work() {
        System.out.println("manager 工作~");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
