package test;

public class Exam2 {

    public static void main(String[] args) {

        for(int 세로 = 1; 세로 < 3; 세로++){
            if(세로 > 0) {
                System.out.println(" ");
            }
           for(int 가로 = 0; 가로 < 5; 가로 ++){
               System.out.printf("*");

           }
        }




        // 높이를 입력해주세요 : 3                // 출력

        /*

           *
          ***
         *****

         */

        // 높이를 입력해주세요 : 5

        // 출력

        /*

              *

             ***

            *****

           *******

          *********

         */

        // 높이를 입력해주세요 : 7

        // 출력

        /*

                  *

                 ***

                *****

               *******

              *********

             ***********

            *************

         */

    }

}