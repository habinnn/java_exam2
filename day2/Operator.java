package day2;

public class Operator {

    // 산술연산자
    public static void main(String[] args) {
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);

        // 정수/ 정수 = 정수
        // 컴퓨터는 정수는 정수끼리, 실수끼리 계산 가능(1과 1.0은 다른수)
        // 정수 - int, 실수 - double
        System.out.println(10 / 20);

        int a = 10;
        double b = 10.0;
        String c = "홍길동";

        // 비교 연산자
        System.out.println(10 > 5);
        System.out.println(10 < 5);
        System.out.println(10 >= 5);
        System.out.println(10 <= 5);
        System.out.println(10 == 5);
        System.out.println(10 != 5);

        // 비교 연산자의 결과는 논리값(맞다/틀리다)
        // 논리값 - boolean

        boolean d = true ;
        boolean e = false ;

        // 증감연산자
        // 변수는 대입하지 않으면 안바뀜

        int num = 10;
        System.out.println(num + 10);

        // num 의 값을 10 증가
        // num = num + 10;
        num += 10
        System.out.println(num);

        // num의 값을 2배 증가
        num *= 2;

        // num의 값을 절반으로 감소

        num /= 2;

        // num의 값 1증가
        num += 1;
        num ++;

        // num의 값 1감소
        num = num -1;
        num -= 1;
        num --;



    }
}
