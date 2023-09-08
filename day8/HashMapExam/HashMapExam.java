package day8.HashMapExam;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExam {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

    // 배열은 같은 자료형만 묶을 수 있었다.
    // 데이터 접근은 인덱싱
    list.add("홍길동");




    // 어디에 뭐가 있는지 모른다. -> 그래서 클래스/객체 사용
    // 해시맵 -> 데이터를 키바인딩하여 저장

        HashMap map = new HashMap();

    // 저장 -> put(key, value)
    // 조회 -> get(key)
    // 수정 -> put(key, value)
    // 삭제 -> remove(key)

         map.put(0, "홍길동");
         System.out.println(map.get(0));

         HashMap<String, String> myMap= new HashMap<>();

        myMap.put("이름", "홍길동");
        myMap.put("나이", "20");
        myMap.put("거주지", "대전");

        System.out.println(myMap);

        // put -> 수정
        myMap.put("이름", "이순신");
        System.out.println(myMap);
        myMap.remove("이름");
        System.out.println(myMap.get("이름"));






    }
}
