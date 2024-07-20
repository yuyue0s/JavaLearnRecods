import java.util.Scanner;

public class SearchStudy {
    public static void main(String[]args){
        //在java 中，我们常用的查找有两种:
        //1) 顺序查找(SeqSearch) sequence顺序
        //2) 二分查找
        //练习：
        //有一个数列：白王、金王、紫王、青王 猜数游戏：从键盘中任意输入一个名称，判断数列中是否
        //包含此名称【顺序查找】要求: 如果找到了，就提示找到，并给出下标值。
        int index = -1;//一个编程技巧/思想:如果我们想要去判断有没有成功
        // 我们可以设置一个变量index索引或者标识符来记录一下
        String arr[] = {"白王", "金王", "紫王", "青王"};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入白王、金王、紫王、青王来查找在第几个");
        String name = myScanner.next();
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i])){
                System.out.println("第"+(i+1)+"个");
                index++;
                break;
            }
        }
        if (index != -1){
            System.out.println("恭喜你找到了");
        }else System.out.println("数组中没有您输入的值");
    }
}
