package day5.casting;

public class ObjectCasting {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        d1.bark();
        c1.meow();

    }
}

class Dog{
    public void bark(){
        System.out.println("멍멍");
    }
}
class Cat{
    public void meow(){
        System.out.println("야옹");
    }
}