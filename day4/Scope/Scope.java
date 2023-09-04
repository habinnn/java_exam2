package day4.Scope;

public class Scope {
    public static void main(String[] args) {
        System.out.println(Person.avgAge);

        Person p1 = new Person();
        System.out.println(p1.age);
    }
}

class Person{
    static int avgAge = 100; // 클래스 변수
    int age = 30 ; // 인스턴스 변수
}
