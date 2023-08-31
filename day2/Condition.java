package day2;

public class Condition {
    public static void main(String[] args) {

        // 소지금이 20000원 미만, 2000원 이상일 때


        int money = 4000;
        if(money < 20000){
            if(money >= 2000){
                System.out.println("포카칩");
            }
        }

        // 할인대상 -> 19세이하, 60세 이상 할인대상

        int age = 61;
        if(age <= 19) {
            System.out.println("할인대상");
        }
        if (age >= 60) {
            System.out.println("할인대상");
        }

        // 조건문 -> 택일구조

        // 양자택일(이지선다)
        // 남녀, 할인대상, 홀짝

        boolean isMale = true;

        if(isMale){
            System.out.println("남자");
        } else {
            System.out.println("여자");
        }


        // 삼자택일(삼지선다)
        // 초중고, 직좌우

        int age2 = 10;
        if(age2 >= 8 && age2 <= 13) {
            System.out.println("초등학교");
        } else if (age2 <= 16) {
            System.out.println("중학교");
        } else if(age2 <=19){
            System.out.println("고등학교");
        }


        // 오자택일(사지선다)
        // 대학성적(A,B,C,D,F)

        int score = 87;

        if(score >= 90) {
            System.out.println("A");
        } else if(score >= 80 && score <= 89){
            System.out.println("B");
        } else if(score >= 70 && score <= 79){
            System.out.println("C");
        } else if(score >= 60 && score <= 69){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}



