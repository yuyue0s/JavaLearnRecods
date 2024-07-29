package com.study;

import java.util.Arrays;
/*
建议：我们需要使用到哪个类，就导入哪个类即可，不建议使用*导入
import java.util.Scanner; //表示只会引入java.util 包下的Scanner
import java.util.*;//表示将java.util 包下的所有类都引入(导入)
*/

public class PackageExercise01 {
    public static void main(String[] args) {
        int arr[] = {-1, -8, 55, 23, 1};
        //排序传统方法，使用冒泡排序
        Arrays.sort(arr);
        //输出排序结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
