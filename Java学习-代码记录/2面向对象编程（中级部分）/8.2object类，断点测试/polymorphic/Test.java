package com.study.polymorphic;

/** 复习一遍 多态参数：方法定义的形参类型为父类类型，实参类型允许为子类类型
 * 定义员工类Employee，包含姓名和月工资[private]，以及计算年工资getAnnual的方法。
 * 普通员工和经理 继承了员工，经理类多了奖金bonus属性和管理manage法，普通员工类多了work方法，
 * 普通员工和经理类要求分别重写getAnnual方法
 * 测试类中添加一个方法showEmpAnnual(Employee e)，实现获取任何员工对象的年工资,
 * 并在main方法中调用该方法 [e.getAnnual()]
 * 测试类中添加一个方法，testWork,如果是普通员工，则调用work方法，如果是经理，则调用manage方法
 */
public class Test {
    public static void main(String[] args) {
        //经理测试
        Manager jack = new Manager("jack",5000,10000);
        Test test = new Test();
        test.testWork(jack);
        System.out.println(test.showEmployeeAnnual(jack));
    }
    public double showEmployeeAnnual(Employee a){
        return a.getAnnual();
    }
    public void testWork(Employee a) {
        if (a instanceof GeneralEmployee){
            ((GeneralEmployee) a).work();
        } else if (a instanceof Manager) {
            ((Manager) a).manege();
        }
    }
}
class Manager extends Employee{
    private double bonus;
    //经理构造器
    public Manager(String name,double salary,double bonus) {
        super(name,salary);
        this.bonus = bonus;
    }
    //经理方法
    public void manege () {
        System.out.println("manage~^O^");
    }
    //计算年薪
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
class GeneralEmployee extends Employee {
    //普通员工构造器
    public GeneralEmployee(String name,double salary) {
        super(name, salary);
    }
    //普通员工工作的方法
    public void work() {
        System.out.println("work~^o^");
    }
    //计算年薪
    public double getAnnual() {
        return super.getAnnual();
    }
}
class Employee {
    private String name;
    private double salary; //月工资
    //构造器
    public Employee(String name,double salary) {
        this.name = name;
        this.salary = salary;
    }
    //计算年工资getAnnual的方法
    public double getAnnual() {
        return salary * 12;
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