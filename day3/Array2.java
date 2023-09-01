package day3;

public class Array2 {
    public static void main(String[] args) {
        // 2차원 배열
        int[] arr = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int[] arr3 = {9,10,11,12};

        int[][] darr = {arr,arr2,arr3};
//        System.out.println(darr[2][3]);

        int[][] darr2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
//        System.out.println(darr[1][2]);

        // 2차원 배열 순회
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(darr2[i][j]);

            }
        }


    }
}
