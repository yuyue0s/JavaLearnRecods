public class LabyrinthExercise {
    public static void main(String[] args) {
        //labyrinth 迷宫
        //1.迷宫8行7列，用二维数组表示int map[][] = new arr[8][7];
        //2.地图map 无障碍为0 有障碍为1
        int map[][] = new int[8][7];
        for (int i = 0;i < 8;i++){
            if (i == 0 || i == 7) {
                for (int j = 0; j < 7; j++){
                    map[i][j] = 1;
                }
            }else {
                for (int j = 0; j < 7; j++){
                    if (j == 0 || j == 6){
                        map[i][j] = 1;
                    }else map[i][j] = 0;
                }
            }
        }
        map[3][1] = 1;
        map[3][2] = 1;
        System.out.println("地图情况");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("======================");
        way test1 = new way();
        test1.findWay(map,1,1);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }
}
class way{
    public boolean findWay(int arr[][],int i , int j){
        if (arr[6][5] == 2){
            return true;
        }else{
            if (arr[i][j] == 0){
                arr[i][j] = 2;
                if (findWay(arr,i+1,j)){
                    return true;
                }else if (findWay(arr, i, j+1)){
                    return true;
                }else if (findWay(arr, i-1, j)){
                    return true;
                }else if (findWay(arr, i, j-1)){
                    return true;
                }else {
                    arr[i][j] = 3;
                    return false;
                }
            }else return false;
        }
    }
}