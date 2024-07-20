import java.util.Scanner;

public class ArrayAdd {
    public static void main(String[]args){
        //要求：实现动态的给数组添加元素效果，实现对数组扩容。
        //1) 原始数组使用静态分配int[] arr = {1,2,3}
        //2) 增加的元素4，直接放在数组的最后arr = {1,2,3,4}
        //3) 用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n
        int arr[] = {1,2,3};
        int arrNew[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length;i++){
            arrNew[i] = arr[i];
        }
        arrNew[arr.length] = 4;
        arr = arrNew;
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        //自己练习所写：(关于数组添加动态的)
        Scanner myScanner  = new Scanner(System.in);
        int arr1[] = {1,2,3};
        while(true) {
            System.out.println("是否给数组arr1添加值");
            char answer = myScanner.next().charAt(0);
            if (answer == 'y'){
                int arr2[] = new int[arr1.length + 1];
                for (int i = 0; i < arr1.length; i++) {
                    arr2[i] = arr1[i];
                }
                System.out.println("请输入要添加的值");
                int num = myScanner.nextInt();
                arr2[arr1.length] = num;
                arr1 = arr2;
                for (int i = 0;i < arr1.length;i++){
                    System.out.print(arr1[i] + " ");
                }
                System.out.println();
            }else if (answer == 'n'){
                System.out.println("不添加就结束");
                break;
            }
        }
    }
}
