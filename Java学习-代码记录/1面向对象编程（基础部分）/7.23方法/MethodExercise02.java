public class MethodExercise02 {
    public static void main(String[]args){
        //编写一个方法copyPerson，可以复制一个Person 对象，返回复制的对象。克隆对象，
        //注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
        Person p1 = new Person();
        p1.name = "小明";
        p1.age = 20;
        Person p2 = p1.copyPerson(p1);
        System.out.println(p1.age + p1.name);
        System.out.println(p2.age + p2.name);
        System.out.println(p1 == p1);//true
        System.out.println(p1 == p2);//false

    }
}
class Person{
    int age;
    String name;

    public Person copyPerson(Person num){
        Person p2 = new Person();
        p2.age = num.age;
        p2.name = num.name;
        return p2;
    }
}
