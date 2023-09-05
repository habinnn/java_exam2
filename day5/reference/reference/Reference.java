package day5.reference.reference;
public class Reference {

    public static void test(String param){
        System.out.println(param);
    }
    public static void main(String[] args) {
        int num = 10;
        String str = "hello";
        double d = 3.14;

        Person p1; // p1은 null 이다. -> 값이없음

        p1 = new Person(); // 사람 한명 생성해서 사람 리모컨을 p1에 저장
        Person p2 = new Person(); // 사람 한명 생성해서 사람 리모컨을 p2에 저장

        p1.age = 20;
        p2.name = "홍길동";

        p2.age = 30;
        p2.name = "이순신";

        // num1, num2는 원본이고, p1,p2는 참조(reference)다.
        int num1 = 10;
        int num2 = num1;

        test(str) ;

        System.out.println(num);
    }
}
