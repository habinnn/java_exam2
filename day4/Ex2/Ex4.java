package day4.Ex2;

// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.

class Person {
    int 나이;
    String 이름;

    public void 자기소개() {
        System.out.println("저는 " + 나이 + "살 " + 이름 + " 입니다.");
    }
}

public class Ex4 {
    public static void main(String[] args) {
        Person a사람1 = new Person();
        a사람1.이름 = "홍길동";
        a사람1.나이 = 22;

        a사람1.자기소개();
        // 출력 : 저는 22살 홍길동 입니다.

        Person a사람2 = new Person();
        a사람2.이름 = "홍길순";
        a사람2.나이 = 25;

        a사람2.자기소개();
        // 출력 : 저는 25살 홍길순 입니다.

        a사람1.자기소개();
        // 출력 : 저는 22살 홍길동 입니다.
    }
}




