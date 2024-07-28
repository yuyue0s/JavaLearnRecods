public class ThisExercise {
    public static void main(String[] args) {
        //定义Person1类，里面有name、age 属性，并提供compareTo 比较方法，用于判断是否和另一个人相等，
        //提供测试类TestPerson用于测试, 名字和年龄完全一样，就返回true, 否则返回false
        PersonOne TestPerson1 = new PersonOne("小明",15);
        PersonOne TestPerson2 = new PersonOne("小明",15);
        System.out.println(TestPerson1.compareTo(TestPerson2));//true
    }
}
class PersonOne{
    int age;
    String name;

    public PersonOne(String name,int age){
        this.age = age;
        this.name = name;
    }
    //compareTo 比较方法
    public boolean compareTo(PersonOne p){
        return this.name.equals(p.name) && this.age == p.age;
    }
}