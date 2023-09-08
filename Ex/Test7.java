package Ex;

import java.util.HashMap;

public class Test7 {
    public static void main(String[] args) {
        // 사람 정보를 map으로 저장하고 출력하기
        // 사람 1 정보
        // 이름 : 홍길동
        // 나이 : 22
        // 키 : 170.5

        HashMap<String, String> person1 = new HashMap<>();

        person1.put("정보", "사람1");
        person1.put("이름", "홍길동");
        person1.put("나이", "22");
        person1.put("키", "170.5");

        person1.put("이름", "임꺽정");
        person1.remove("키");

        System.out.println(person1);

        // 사람 2 정보
        // 이름 : 홍길순
        // 나이 : 25
        // 키 : 162.4

        HashMap<String, Object> person2 = new HashMap<>();
        person2.put("정보", "사람2");
        person2.put("이름", "홍길순");
        person2.put("나이", 25);
        person2.put("키", 162.4);
        System.out.println(person2);
    }
}
