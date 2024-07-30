package com.use;

import com.study.modifier.AccessModifierA;
import com.xiaoming.Dog;

public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        com.xioaqiang.Dog d2 = new com.xioaqiang.Dog();

        AccessModifierA t1 = new AccessModifierA();
        System.out.println(t1.n1);

    }
}
