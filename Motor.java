package data;

import java.util.Random;

public class Motor implements DeathRace {
    @Override
    public String toString() {
        return "Motor [model=" + model + ", volume=" + volume + ", vin=" + vin + "]";
    }
    public Motor(String model, String volume, String vin) {
        this.model = model;
        this.volume = volume;
        this.vin = vin;
    }
    public static final double MAX_SPEED =  180;
    private String model; // Exciter 2021, Winner 2020
    private String volume; // số phân khối
    private String vin; // biển số, số khung, Vehicle Identifier Number
    public static double getMaxSpeed() {
        return MAX_SPEED;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getVolume() {
        return volume;
    }
    public void setVolume(String volume) {
        this.volume = volume;
    }
    public String getVin() {
        return vin;
    }
    public void setVin(String vin) {
        this.vin = vin;
    }
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }
    // quay video và gáy tốc độ
    public void showRecord() {
        System.out.printf("|%-10s|%-15s|%8s|%11s|%5.1f|\n", 
                "Motor",model, volume, vin, run());
    }
    


    @Override
    public double runToDeath() {
        return run() * 3;
    }

    @Override
    public void showHowToDeath() {
        System.out.printf("|%-10s|%-15s|%8s|%11s|%5.1f|\n", 
                "Motor",model, volume, vin, runToDeath());
    }
}
