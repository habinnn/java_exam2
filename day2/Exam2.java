
public class Exam2 {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            for (int j = 3; j > i ; j--) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i ; j++) {
                System.out.printf("*");

            }
            System.out.println();

                

            
        }
        // 출력
    /*

    높이 : [3]

      *
     **
    ***

    */

    /*

    높이 : [5]

        *
       **
      ***
     ****
    *****

    */

    /*

    높이 : [7]

          *
         **
        ***
       ****
      *****
     ******
    *******

    */
    }
}