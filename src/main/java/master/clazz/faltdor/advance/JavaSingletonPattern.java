package main.java.master.clazz.faltdor.advance;

/**
 * "The singleton pattern is a design pattern that restricts the instantiation of a class to one object.
 * This is useful when exactly one object is needed to coordinate actions across the system."
 * - Wikipedia: Singleton Pattern
 */
public class JavaSingletonPattern {

    public static void main(String... args){
        Singleton singleton = Singleton.getSingleInstance();
        System.out.print(singleton.sayHello());
    }
}

class Singleton{
    public String str;
    private static Singleton singleton;

    private Singleton() {
    }
    public static Singleton getSingleInstance(){
        if (singleton == null){
            return new Singleton();
        }
        return singleton;
    }

    public String sayHello(){
        return "Hello I am a singleton! Let me say hello world to you";
    }
}