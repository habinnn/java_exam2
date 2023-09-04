package day3;
public class arrayExam {
    // 배열을 두번 출력해주세요.
    public static double circleArea(int radius) { // void -> double로 수정. 리턴타입은 리턴값과 자료형이 일치해야함.
        double result = radius * radius * 3.14;
        System.out.println(result);

        return result; // 함수에서 리턴할 때 result값을 들고감.
    }
}
