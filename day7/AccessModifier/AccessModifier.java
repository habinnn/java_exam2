package day7.AccessModifier;


// 접근 제어자
public class AccessModifier {
    public static void main(String[] args) {
        // public -> 어디서든 누구나
        // protected -> 같은 패키지(폴더) + 상속관계
        // default -> 같은 패키지
        // private -> 자기 자신

        Calculator c1 = new Calculator();
        c1.plus();
        System.out.println(c1.plus());
        System.out.println(c1.divide());

//         숫자를 0으로 나누면 안된다.
//         객체의 인스턴스 변수를 바꾸는 것은 부담스러운 작업이다.
//         private 접근제어자를 이용해 접근을 막는다.

//        c1.num1 = 200;
//        c1.num2 = 0;

        c1.setNum1(100);
        c1.setNum2(200);

        System.out.println(c1.divide());
        System.out.println(c1.plus());



//        Calculator2 c2 = new Calculator2();
//        c2.plus();
    }
}
class Calculator {

    //  그냐 웬만하면 객체변수는 private
    private int num1 = 10;
    private int num2 = 20;

    // 외부에서 객체 변수에 접근하기 메서드 출력
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }

    public int plus(){

        return num1 + num2 ;
    }

    public double divide(){
        return (double)num1 / num2;
    }
}