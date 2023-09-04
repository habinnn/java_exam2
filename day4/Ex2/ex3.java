package day4.Ex2;

// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요. 그리고 printValue 함수를 완성시켜주세요.


class ss {

    static int num = 10;

    public static String printValue(String a) {
        String result = a;
        return result; // 값을 반환
    }
public class ex3{
    public static void main(String[] args) {
        System.out.println(num); // 출력 : 10

        String result = printValue("안녕"); // 메서드 호출 결과를 저장
        System.out.println(result); // 출력 : 안녕
    }
}
}


