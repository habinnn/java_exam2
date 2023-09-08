package day8.Array;

import java.util.ArrayList;



public class Array {
    public static void main(String[] args) {
        Integer[] iarr = new Integer[10]; // 배열은 불편해서 쓰질않음

        int[] arr = {1,2,3,4,5};
        for(int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }
        // 배열의 삭제, 추가 -> 귀찮음
        // 몇개 저장 했는지 알기 힘듦.

        int[] arr2 = new int[10];

        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;

        System.out.println(arr2.length);

        // 저장소가 꽉 차면 알아서 늘어나고
        // 추가 삭제도 되고
        //



    }
}
//class 저장소{
//    ArrayList<Integer> a저장소 = new ArrayList<>();
//
//
//
//    // 추가 - add()
//    // 삭제 - remove()
//    // 수정 - set()
//    // 조회 - get()
//    // 사이즈 -size()
//
//    a저장소.add(10);
//}
