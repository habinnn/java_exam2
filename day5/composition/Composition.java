package day5.composition;

public class Composition {
    public static void main(String[] args) {
        홍길동 a홍길동 = new 홍길동();
        a홍길동.자바프로그래밍();

        홍길순 a홍길순 = new 홍길순();
        a홍길순.자바프로그래밍();

    }
}
class 홍길동{
    public void C언어프로그래밍(){
        System.out.println("C언어 프로그램 개발");
    }
    public void 자바프로그래밍(){
        System.out.println("자바8 프로그램 개발");
    }
}
class 홍길순{
    public void 자바프로그래밍(){
        System.out.println("자바8 프로그램 개발");
    }

    public void 파이썬프로그래밍(){
        System.out.println("파이썬3.13 프로그램 개발");
    }

}
