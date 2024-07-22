public class ArrayExercise02 {
    public static void main(String[]args){
        //随机生成10个整数(1-100的范围)保存到数组，并倒序打印
        //以及求平均值、求最大值和最大值的下标、并查找里面是否有8
        int arr1[] = new int[10];
        for(int i = 0; i < 10; i++){
            //Math.random()是令系统随机选取大于等于 0.0 且小于 1.0 的伪随机 double 值
            int num = (int)(Math.random()*100+1);
            arr1[i] = num;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        int arr2[] = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[arr1.length - 1 - i];
        }
        for(int i = 0;i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        int sum = 0; // 总数
        for(int i = 0;i < 10; i++){
            sum += arr2[i];
        }
        System.out.println();
        int averageSum = sum / arr2.length;
        System.out.println("平均值是" + averageSum);
        int temp = arr2[0];; //设置一个变量去求最大值
        int num = 0; //记录下标
        for(int i = 0; i < arr2.length - 1; i++){
            if(temp < arr2[i + 1]){
                temp = arr2[i + 1];
                num = i + 1;
            }
        }
        System.out.println("最大值是" + temp + "下标为" + num);
        int index = -1;
        for(int i = 0;i < arr2.length;i++){
            if(arr2[i] == 8){
                index ++;
                break;
            }
        }
        if(index == -1){
            System.out.println("没有8");
        }else System.out.println("有8");
    }
}
