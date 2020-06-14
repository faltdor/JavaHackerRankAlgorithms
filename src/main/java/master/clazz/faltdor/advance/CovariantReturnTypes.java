package main.java.master.clazz.faltdor.advance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CovariantReturnTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}

class Flower {
    protected String name;

    public Flower(String name) {
        this.name = name;
    }

    public String whatsYourName() {
        return name;
    }
}

class Jasmine extends  Flower{
    public Jasmine(String name) {
        super(name);
    }
}

class Lily extends Flower{
    public Lily(String name) {
        super(name);
    }
}

class Region {
    protected Flower flower;

    public Flower yourNationalFlower() {
        return flower;
    }
}

class WestBengal extends Region{
    @Override
    public Flower yourNationalFlower() {
        return new Jasmine("Jasmine");
    }
}

class AndhraPradesh extends Region{
    @Override
    public Flower yourNationalFlower() {
        return new Lily("Lily");
    }
}