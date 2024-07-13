public class ExerCise3 {
    public static void main (String[]args){
        System.out.println(60 > 20);//ture
        System.out.println(!(60 > 20));//false
    //^逻辑与或 两边不同为ture 否则false
        boolean a = (1 < 5) ^ (3 > 2);
        System.out.println("a=" + a);//false
    }
}
