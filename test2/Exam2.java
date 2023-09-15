package test2;

public class Exam2 {
    public static void main(String[] args) {


        star(3);
        star(5);
        star(7);

        /*

         *

         ***

         *****

         */





        /*

         *

         ***

         *****

         *******

         *********

         */



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

    public static void star(int idx){
        int line = 0;
        for(int i =1 ; i<= idx; i ++){
            for(int j = 1 ; j <= idx * 2; j++){
                line = idx - i;
                if(line < j && j < (idx *2) - line ){
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }

            }
            System.out.println();
        }
    }

}

