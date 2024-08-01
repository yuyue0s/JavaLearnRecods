package com.study.polymorphic.polyparameter;

public class Test {
    public static void main(String[] args) {
        Worker tom = new Worker("tom",3000);
        Manager jack = new Manager("jack",5000,10000);
        Test test = new Test();
        test.showEmpAnnual(tom);
        test.showEmpAnnual(jack);

        test.testWork(tom);
        test.testWork(jack);
    }
    public void showEmpAnnual(Employee someone) {
        System.out.println(someone.getAnnual());
    }
    public void testWork(Employee someone) {
        if (someone instanceof Worker) {
            ((Worker) someone).work();
        }else if (someone instanceof Manager){
            ((Manager) someone).manage();
        }else System.out.println("无");
    }
}
