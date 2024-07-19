public class ExerciseOfNumber {
    public static void main(String[]args){
        //Java输出4位数整数，输出这个数的千位，百位，十位，个位
        //比如1234
        int number = 1234;
        //千位数：
        System.out.println(number/1000);
        //百位数:
        System.out.println(number%1000/100);
        //十位：
        System.out.println(number%1000%100/10);
        //个位
        System.out.println(number%1000%100%10);
    }
}
