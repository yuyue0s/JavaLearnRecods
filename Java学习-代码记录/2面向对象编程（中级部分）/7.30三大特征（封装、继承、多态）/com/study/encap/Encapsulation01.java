package com.study.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("悦悦");
        p1.setAge(3);
        p1.setSalary(100);
        p1.info();
        System.out.println(p1.getSalary(123456));
        System.out.println("=====构造器=======");
        //如果我们要使用构造器
        Person jack = new Person("jack", 188, 100);
        jack.info();
    }
}
/*
封装举例：
不能随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。
年龄合理就设置，否则给默认年龄,必须在 1-120,年龄，工资不能直接查看，name的长度在 2-6个字符 之间
 */
class Person{
    public String name;
    private double salary;
    private int age;

    public Person() {
    }
    //如果我们要使用构造器 可以使用构造器和setXxx进行结合
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        上面这样写就绕过了set方法 所以我们可以使用构造器和setXxx进行结合
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    //可以用快捷键 alt + insert 或者生成
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6){
            this.name = name;
        }else {
            System.out.println("名字长度不符合输入要求 需要在2-6字之间");
            this.name = "无";
        }
    }

    public double getSalary(int password) {
        if (password == 123456){
            System.out.println("密码正确");
            return salary;
        }else {
            System.out.println("密码错误");
            return -1;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >=1 && age <= 120) {
            this.age = age;
        }else {
            System.out.println("年龄不符合输入要求 需要在1-120之间");
            this.age = 1;
        }
    }

    public void info(){
        System.out.println("name="+name+" age="+age+" salary="+salary);
    }
}