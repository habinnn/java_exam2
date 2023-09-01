package day3;



public class FunctionReturn {

    public static double circumference(int num){
        double result = num * num * 3.14  ;

        System.out.println(result);

        return result;

    }
    public static void main(String[] args) {
        // 1. 반지름으로 원의 넓이를 구하는 함수만들기(정의).
        // 반지름 * 반지름 = 3.14
        // circumference(5); // 함수에서 리턴할 때 값을 하나 가지고 올 수 있다. ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★

        // 2. 반지름이 5인 원의 넓이를 구해서 출력
        double num = circumference(5);
        System.out.println(num);

        // 3. 반지름이 5인 원의 넓이를 2로 나눈 값
        System.out.println(num / 2);
        // 4. 반지름이 5인 원의 넓이를 2로 곱한 값
        System.out.println(num * 2);

        // 리턴 -> 함수가 작업한 결과를 직접 받을 수 있음.
        // 함수의 결과를 2차 가공할 수 있음

    }


}
