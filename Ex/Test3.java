package Ex;

public class Test3 {
    public static void main(String[] args) {
        솔루션 s1 = new 솔루션();
        System.out.println(s1.solution(10));
    }
}
class 솔루션 {
    int sum = 0;
    public int solution(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += i;

            }

        }
        return sum;
    }
}



