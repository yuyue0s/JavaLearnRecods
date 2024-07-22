import java.util.Scanner;

public class ArrayExericse01 {
    public static void main(String[]args){
        //已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序,
        //比如:[10，12，45，90]，添加23后,数组为[10，12，23，45，90]
        //方法1：(自己的写法)
        //先扩容 然后将数加入新数组后 进行冒泡排序
        double arr1[] = {10, 12, 45, 90};
        double arr2[] = new double[arr1.length + 1];
        //定义一个新数组
        for (int i = 0; i < arr1.length;i++){
            arr2[i] = arr1[i];
        }
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个值添加至数组");
        double num = myScanner.nextDouble();
        //将新数字添加进去arr2新数组
        arr2[arr1.length] = num;
        double temp = 0; //设置一个变量
        //进行冒泡排序
        for (int i = 0; i < arr2.length-1; i++) {
            for (int j = 0;j < arr2.length - 1 - i;j++){
                if (arr2[j] > arr2[j + 1]){
                    temp = arr2[j + 1];
                    arr2[j + 1] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        arr1 = arr2;
        for (int i = 0; i < arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        //方法2：(别人的写法)
        //先确定 添加的数应该插入哪个索引 然后再去扩容
        int arr[] = {10, 12, 45, 90};
        //设置一个变量index 来查看在哪个索引 addNum < arr[i]
        int index = -1;
        int addNum = 99; //要加入的数
        for(int i = 0; i < arr.length; i++){
            if(addNum < arr[i]){
                index = i;
                break;
            }
        }
        if(index == -1){
            index = arr.length;
        }
        int arrNew[] = new int[arr.length + 1];
        for(int i = 0,j = 0; i < arrNew.length; i++){
            if(i != index){
                arrNew[i] = arr[j];
                j++;
            }else arrNew[i] = addNum;
        }
        arr = arrNew;
        for(int i = 0;i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
