package day3;

public class LoopSolve {
    public static void main(String[] args) {
        int y = 3;
        int lineNum = 1;
        // y는 높이
        // 공백의 개수 -> 높이 - line 번호
        // 출력


        for (int j = 1; j < 6; j+= 2) {
            // 공백 그리기
            for(int i = 0; i < lineNum; i++){
                System.out.println(" ");
            }
            System.out.println(); // 줄바꿈
            lineNum++;

            // 별 그리기
            for(int i = 0; i < j; i ++){
                System.out.printf("*");
            }
            System.out.println();
        }


        // 3 - 1
        // 3 - 2
        // 3 - 3



//          *
//         ***
//        *****








    }
}
