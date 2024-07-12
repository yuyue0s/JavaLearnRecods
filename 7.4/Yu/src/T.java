public class T {
    public static void main(String[] args){
//        String seasonName = switch (seasonCode){
//            case 0 -> "Spring";
//            case 1 -> "Summer";
//            case 2 -> "Fall";
//            case 3 -> "winer";
//            default ->"???";
//        };
        int a = 1;
        int b = switch (a){
            case 1 -> 2;
            case 2 -> 4;
            case 3 -> 9;
            default -> 0;
        };
    }
}
