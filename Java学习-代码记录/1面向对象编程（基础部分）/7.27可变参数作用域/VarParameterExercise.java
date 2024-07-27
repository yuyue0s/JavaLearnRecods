public class VarParameterExercise {
    public static void main(String[] args) {
        //有三个方法，分别实现返回姓名和两门课成绩(总分)，返回姓名和三门课成绩(总分)，返回姓名和五门课成绩(总分)。
        //封装成一个可变参数的方法类名 HspMethod 方法名 showScore
        HspMethod test = new HspMethod();
        System.out.println(test.showScore("贺博",72,60,72));
    }
}
class HspMethod{
    int age;
    public String showScore(String name,double...score){
        System.out.println(age);
        double sumScore = 0;
        for(int i = 0;i < score.length;i++){
            sumScore += score[i];
        }
        return name + sumScore;
    }
}