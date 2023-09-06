package day6.constructor;

public class InheritanceVariable {


    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.move();
        Cat c1 = new Cat();
        c1.meow();
        c1.move();
    }
}
class Animal{
    String name;
    Animal(){
        this.name = "동물";
    }
    public void move(){
        System.out.printf("%s이/가 움직이다.\n", this.name);
    }
}
class Dog extends Animal{
    Dog(){
        this.name = "맥스";
    }
    public void bark(){
        System.out.printf("%s가멍멍\n",this.name);
    }

}
class Cat extends Animal{

    Cat(){
        this.name = "아리";
    }
    public void meow(){
        System.out.printf("%s가야옹\n",this.name);
    }
}
