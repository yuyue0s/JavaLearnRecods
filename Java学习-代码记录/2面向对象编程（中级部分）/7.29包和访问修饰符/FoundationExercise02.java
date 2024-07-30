public class FoundationExercise02 {
    public static void main(String[] args) {
        //练习：有个人 Tom 设计他的成员变量,成员方法,可以电脑猜拳,电脑每次都会随机生成 0,1,2
        //0表示石头，1表示剪刀，2表示布并要可以显示 Tom的输赢次数(清单)
        Person test1 = new Person();
        test1.games(1);
    }
}
class Person{
    String name = "Tom";
    int winnerNum = 0;
    int lostNum = 0;
    public void games(int n){
        int index = (int)(Math.random()*3);
        if (n == 0){
            if (index == 0){
                System.out.println("平局");
            } else if (index == 1) {
                System.out.println("你赢了");
                winnerNum++;
            }else if (index == 2){
                System.out.println("你输了");
                lostNum++;
            }
        }else if (n == 1){
            if (index == 0){
                System.out.println("你输了");
                lostNum++;
            } else if (index == 1) {
                System.out.println("平局");
            }else if (index == 2){
                System.out.println("你赢了");
                winnerNum++;
            }
        }else if (n == 2){
            if (index == 0){
                System.out.println("你赢了");
                winnerNum++;
            } else if (index == 1) {
                System.out.println("平局");
            }else if (index == 2){
                System.out.println("你输了");
                lostNum++;
            }
        }else System.out.println("请输入0代表石头,1代表剪刀,2代表布");
        System.out.println("到目前为止赢了"+winnerNum+"次 输了"+lostNum+"次");
    }
}
