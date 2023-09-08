package day8.Exception;

public class ExceptionExam2 {
    public static void main(String[] args) {
        Person2 p1 = null;
       try{
        p1.hi();
       } catch (NullPointerException e){
           System.out.println("에러");

       }

    }
}

class Person2 {
    public void hi(){
        System.out.println("안녕");
    }
}
