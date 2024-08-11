package com.study.abstrcat_.employee;

public class CommonEmployee extends Employee{
    public CommonEmployee(String name,String id,double salary){
        super(name, id, salary);
    }
    public void work() {
        System.out.println("work~ 工人");
    }

}
