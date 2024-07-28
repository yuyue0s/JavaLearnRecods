public class Exercise01 {
    public static void main(String[] args) {
        //练习1：编写类A01，定义方法max，实现求某个double数组的最大值，并返回
        double arr1[] = {7.5, 6.7, 10.4, 12.1, 9.4, 6};
        A01 test1 = new A01();
        test1.max(arr1);
        //练习2：编写类A02，定义方法find，实现查找某字符串是否在字符串数组中，并返回索引,如果找不到，返回-1
        String arr2[] = {"小明", "小宇", "小六", "小因"};
        A02 test2 = new A02();
        System.out.println(test2.find("小五",arr2));
        //练习3：编写类Book，定义方法updatePrice，实现更改某本书的价格，
        //具体:如果价格>150,则更改为150，如果价格>100,更改为100，否则不变
        Book test3 = new Book();
        System.out.println(test3.updatePrice(134));
    }
}
class Book{
    public double updatePrice(double price){
        if (price > 100 && price <=150){
            return 100;
        }else if (price > 150){
            return 150;
        }else return price;
    }
}

class A02{
    public int find(String n,String arr[]){
        for (int i = 0;i < arr.length;i++){
            if (n.equals(arr[i])){
                return i;
            }
        }
            return -1;
    }
}

class A01{
    public double max(double arr[]){
        if (arr == null || arr.length == 0){
            System.out.println("数组为空或者长度为0");
        }else {
            double max = arr[0];
            for (int i = 1;i < arr.length;i++){
                if (arr[i] > max){
                    max = arr[i];
                }
            }
            System.out.println(max);
            return max;
        }
        return 0;
    }
}