package main.java.master.clazz.faltdor.ObjectOrientedProgramming;

/**
 * Using inheritance, one class can acquire the properties of others.
 */
public class JavaInheritanceI {

    public static void main(String args[]){
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}
abstract class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    void sing(){
        System.out.println("I am singing");
    }
}
