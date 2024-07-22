import java.util.Scanner;

public class ArrayExericse01 {
    public static void main(String[]args){
        //已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序,
        //比如:[10，12，45，90]，添加23后,数组为[10，12，23，45，90]
        double arr1[] = {10, 12, 45, 90};
        double arr2[] = new double[arr1.length + 1];
        for (int i = 0; i < arr1.length;i++){
            arr2[i] = arr1[i];
        }
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个值添加至数组");
        double num = myScanner.nextDouble();
        arr2[arr1.length] = num;
        double temp = 0;
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
    }
}
