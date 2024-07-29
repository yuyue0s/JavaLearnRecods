public class FoundationExercise01 {
    public static void main(String[] args) {
        //练习1：定义Music类，里面有音乐名name、音乐时长times属性，并有播放play功能和这回本身属性信息的功能方法getInfo
        Music test1 = new Music("明天你好",5.20);
        test1.play();
        System.out.println(test1.getInfo());

        //创建一个Employee类， 属性有(名字,年龄,职位,性别,薪水)，提供3个构造方法，可以初始化
        //(1)(名字，性别，年龄，职位，薪水)，
        //(2)(名字，性别，年龄) (3)(职位，薪水)，要求充分复用构造器
        Employee test2 = new Employee("学生",0);

    }
}
class Employee{
    String name;
    int age;
    String job;
    String gender;
    double salary;
    public Employee(String name,int age,String gender,String job,double salary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.job = job;
        this.salary = salary;
    }
    public Employee(String name,int age,String gender){
        this(name,age,gender," ",0);
    }
    public Employee(String job,double salary){
        this(" ",0 ," ",job,salary);
    }
}

class Music{
    String musicName;
    double musicTimes;

    public Music(String musicName,double musicTimes){
        this.musicName = musicName;
        this.musicTimes = musicTimes;
    }

    public void play(){
        System.out.println("播放音乐" + this.musicName);
    }

    public String getInfo(){
        return "音乐名:" + this.musicName + " 音乐时长:" + this.musicTimes + "分钟";
    }
}
