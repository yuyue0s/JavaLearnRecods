public class ArrayDetail {
    public static void main(String[]args){
        /*
        1) 数组是多个相同类型数据的组合，实现对这些数据的统一管理
        2) 数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用。
        3) 数组创建后，如果没有赋值，有默认值int 0，short 0, byte 0, long 0,
           float 0.0,double 0.0，char \u0000，boolean false，String null
        4) 使用数组的步骤: 1声明数组并开辟空间  2给数组各个元素赋值  3使用数组
        5) 数组的下标是从0 开始的。
        6) 数组下标必须在指定范围内使用，否则报：下标越界异常，
           比如int [] arr=new int[5]; 则有效下标为0-4
        7) 数组属引用类型，数组型数据是对象(object)
        */
        char array[] = new char[5];
        for (int i = 0;i < 5;i++){
            System.out.println(array[i]);
        }
    }
}
