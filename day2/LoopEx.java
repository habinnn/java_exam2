package day2;

public class LoopEx {
    public static void main(String[] args) {
//        System.out.println("=== 1회차 ===");
//        for(int i = 1; i < 6; i++){
//            System.out.println(i);
//        }
//        System.out.println("=== 2회차 ===");
//        for(int i = 1; i < 6; i++) {
//            System.out.println(i);
//        }
//        System.out.println("=== 3회차 ===");
//        for(int i = 1; i < 6; i++) {
//            System.out.println(i);
//        }
        for(int j = 0; j < 3; j++){
            System.out.printf("=== %d회차 ===\n" , (j+1));
            for (int i = 1; i < 6; i++){
                System.out.println(i);
            }
        }

    }
}
