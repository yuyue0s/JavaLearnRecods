import java.util.Scanner;

public class ArrayReduceExercise {
    public static void main(String[]args){
        //有一个数组{1， 2， 3， 4， 5}， 可以将该数组进行缩减，
        //提示用户是否继续缩减，每次缩减最后那个元素。当只剩下最后一个元素，提示，不能再缩减。
        int arr1[] = {1, 2, 3, 4, 5};
        Scanner myScanner = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("是否继续缩减");
            char answer = myScanner.next().charAt(0);
            if (answer == 'y') {
                if (arr1.length > 1) {
                    int arr2[] = new int[arr1.length - 1];
                    for (int i = 0; i < arr2.length; i++) {
                        arr2[i] = arr1[i];
                    }
                    arr1 = arr2;
                    for (int i = 0; i < arr1.length; i++) {
                        System.out.print(arr1[i] + " ");
                    }
                }else System.out.println("数组只剩下一个元素了，不能缩减了");
            }else break;
        }while (true);
        System.out.println("结束");
    }
}
