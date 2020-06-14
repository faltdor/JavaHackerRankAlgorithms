package main.java.master.clazz.faltdor.ObjectOrientedProgramming;

import java.util.Scanner;

/**
 * A Java abstract class is a class that can't be instantiated.
 * That means you cannot create new instances of an abstract class. It works as a base for subclasses.
 */
public class JavaAbstractClass {
    public static void main(String []args){
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();

    }
}

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
class MyBook extends Book{

    @Override
    void setTitle(String s) {
        super.title = s;
    }
}
