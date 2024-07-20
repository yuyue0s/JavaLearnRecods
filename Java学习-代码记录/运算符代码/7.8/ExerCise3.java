public class ExerCise3 {
    public static void main(String[] args){
        //假如还有59天放假，问：合多少星期多少天
        //理解需求
        //思路分析
        //写代码
        int days = 59;
        int weeks = days/7;
        int leftDays = days%7;
        System.out.println(weeks + "周" + leftDays + "天");
    }
}
