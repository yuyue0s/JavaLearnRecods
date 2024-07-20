public class ArrayOfIntroduction {
    public static void main(String[]args){
        //引入：一个养鸡场有6 只鸡，它们的体重分别是3kg,5kg,1kg,3.4kg,2kg,8kg 。
        //请问这六只鸡的总体重是多少?平均体重是多少?

        //数组的介绍
        //数组可以存放多个同一类型的数据。数组也是一种数据类型，是引用类型。
        //即：数(数据)组(一组)就是一组数据

        //定义一个数组 说明：
        //1. double[] 表示是double 类型的数组， 数组名hens
        //2. {3, 5, 1, 3.4, 2, 8} 表示数组的值/元素,依次表示数组的第几个元素
        //3. 遍历数组得到数组的所有元素的和， 使用for
        //4. 我们可以通过hens[下标] 来访问数组的元素标是从0开始编号的
        //   比如第一个元素就是hens[0] 第2 个元素就是hens[1] 依次类推
        //5. 通过for 就可以循环的访问数组的元素/值
        //6. 可以通过数组名.length 得到数组的大小/长度
        double sum = 0;
        double[]hens = {3, 5, 1, 3.4, 2, 8};
        for(int i = 0;i < hens.length;i++){
            sum += hens[i];
        }
        System.out.println(sum / hens.length);
    }
}
