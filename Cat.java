package data;

import java.util.Random;

public class Cat extends Pet {
    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-15s|%4d|%4f|%4f|\n",
                        "Cat",name, yob, weight, run());
        
    }

    public Cat(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    public static final double MAX_SPEED = 50;
}
