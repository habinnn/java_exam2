package Ex;

import java.util.Scanner;

public class Solo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str = scan.next(); // 한 단어 읽기
        String str2 = scan.nextLine(); // 한 문장 읽기
        System.out.println("당신이 입력한 값은 : "  + num); // 숫자 하나 읽기
        System.out.println("당신이 입력한 단어는 : " + str);
        System.out.println("당신이 입력한 문자는 : " + str2);
        }
    }

