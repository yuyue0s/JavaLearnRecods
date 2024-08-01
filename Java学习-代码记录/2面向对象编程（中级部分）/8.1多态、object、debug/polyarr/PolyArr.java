package com.study.polymorphic.polyarr;
//现有一个继承结构如下：要求创建1 个Person 对象、2 个Student 对象和2 个Teacher 对象,
//统一放在数组中，并调用每个对象say 方法.
//应用实例升级：如何调用子类特有的方法，比如
//Teacher 有一个teach , Student 有一个study 怎么调用？
public class PolyArr {
    public static void main(String[] args) {
        Person person[] = new Person[5];
        person[0] = new Person(0,"tom0");
        person[1] = new Student(1,"tom1",60);
        person[2] = new Student(2,"tom2",80);
        person[3] = new Teacher(3,"tom3",100);
        person[4] = new Teacher(4,"tom4",120);
        //3 教师 去teach
        Teacher teacher1 = (Teacher) person[3];
        teacher1.teach();
        //1 学生 去study
        Student student1 = (Student) person[1];
        student1.study();

        for (int i = 0; i < person.length; i++) {
            if (person[i] instanceof Student){
                System.out.println(person[i].say());
                Student student = (Student) person[i];
                student.study();
                //((Student) person[i]).study();
            }else if (person[i] instanceof Teacher){
                System.out.println(person[i].say());
                Teacher teacher = (Teacher) person[i];
                teacher.teach();
            }else System.out.println(person[i].say());

        }
    }
}
