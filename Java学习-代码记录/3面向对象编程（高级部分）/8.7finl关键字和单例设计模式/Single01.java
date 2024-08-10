package com.study;

public class Single01 {
        //步骤[单例模式-饿汉式]
        //1. 将构造器私有化
        //2. 在类的内部直接创建对象(该对象是static)
        //3. 提供一个公共的static 方法，返回gf 对象
        public static void main(String[] args) {
            System.out.println(GirlFriend.one());
        }
    }
    class GirlFriend{
        private String name;
        private GirlFriend(String name) {
            this.name = name;
        }
        //创建一个对象 要求静态 后面方法才可以调用
        private static GirlFriend xQ = new GirlFriend("小晴");
        //提供一个公共方法
        public static GirlFriend one() {
            return xQ;
        }

        @Override
        public String toString() {
            return "girlFriend{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }