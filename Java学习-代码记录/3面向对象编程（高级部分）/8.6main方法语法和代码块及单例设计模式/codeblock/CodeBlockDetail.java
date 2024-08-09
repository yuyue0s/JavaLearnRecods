package com.codeblock;

public class CodeBlockDetail {
    public static void main(String[] args) {
        //1.static代码块随着类的加载而执行 并且只会执行一次。普通代码块每创建一个对象 就执行

        //2.类什么时候会加载？
        //（1）创建对象实例时（new）
        //AA aa = new AA();
        //（2）创建子类对象的时候 父类也会被加载（先加载父类的对象）
        BB bb = new BB();
        //（3）使用类的静态成员时
        System.out.println(dog.name);

        System.out.println("=====");
        //3.普通的代码块，在创建对象实例时，会被隐式的调用。
        //被创建一次，就会调用一次。
        //如果只是使用类的静态成员时，普通代码块并不会执行 cat类
        System.out.println(cat.n1);
    }
}
class cat {
    static int n1 = 1;
    //静态代码块
    static {
        System.out.println("静态");
    }
    //普通代码块
    {
        System.out.println("普通");
    }
}

class dog {
    static String name = "tom";
    static {
        System.out.println("dog");
    }
}

class AA {
    static {
        System.out.println("AA");
    }
}

class BB extends AA {
    static {
        System.out.println("BB");
    }
}