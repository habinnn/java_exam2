package day3;

public class Function {

    // 함수정의
    // void - 리턴타입
    // test - 함수명
    // () - 매개변수
    public static void test(){
        System.out.println("코드1");
        System.out.println("코드2");
        System.out.println("코드3");

    }

    public static void main(String[] args) {
        // 함수
        // 코드 저장소
        // 함수는 정의해야 한다 -> 함수 정의 문법 사용
        // - 규칙1. 함수는 클래스 안에서 정의해야 한다. (함수 안에 함수 정의 X)
        // - 규칙2. 리턴타입, 함수명, 매개변수를 지정해야한다.
        // - 규칙3. 같은 이름의 함수를 2개 이상 만들지 않는다.
        // - 규칙4. 함수는 호출(사용) 해야만 실행된다.


        test();
    } // 끝

    // 정의된 함수 호출(사용)
}
