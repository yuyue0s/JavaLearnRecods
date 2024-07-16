public class BitOperatorExercise2 {
    public static void main(String[]args){
        System.out.println(8 >> 2);//本质 8 / 2 / 2 = 2
        System.out.println(4 >>> 2);//本质 4 / 2 / 2 = 1
        System.out.println(24 >>> 3);//本质 24 / 2 / 2 / 2 = 3
        System.out.println(24 >> 3);//本质 24 / 2 / 2 / 2 = 3
        System.out.println(2 << 3);//本质 2 * 2 * 2 * 2 =16
    }
}
