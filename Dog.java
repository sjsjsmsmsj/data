package data;

import java.util.Random;

public class Dog extends Pet implements DeathRace {
    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-15s|%4d|%4f|%4f|\n",
                        "Dog",name, yob, weight, run());
        
    }

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    public static final double MAX_SPEED = 40;


    @Override
    public double runToDeath() {
        return run() * 3;
    }

    @Override
    public void showHowToDeath() {
        System.out.printf("|%-10s|%-15s|%4d|%4f|%4f|\n",
                        "Dog",name, yob, weight, runToDeath());
    }
}
