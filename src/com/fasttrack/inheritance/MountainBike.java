package com.fasttrack.inheritance;

public class MountainBike extends Bike {

    private int suspensionStrength;

    public String speed;

    public MountainBike(int tyrePressure) {
        super(tyrePressure);
        this.suspensionStrength = 5;
    }

    public int getSpeed(){
        return super.speed;
    }

    public MountainBike(int tyrePressure, int suspensionStrength) {
        super(tyrePressure);
        this.suspensionStrength = suspensionStrength;
    }

    @Override
    public void increaseSpeed(int increment) {
        System.out.println("MountainBike implementation");
        super.increaseSpeed(increment);
    }

    public void increaseSuspensionStrength() {
        this.suspensionStrength++;
    }

    public void increaseSuspensionStrength(int amount) {
        this.suspensionStrength += amount;
    }

    public void increaseSuspensionStrength(int withAmount, String str) {
        this.suspensionStrength += withAmount * 2;
    }

    public void increaseSuspensionStrength(String str, int withAmount) {
        this.suspensionStrength += withAmount * 2;
    }

    public void increaseSuspensionStrength(int withAmount, int factor, String str) {
        this.suspensionStrength += withAmount * 2;
    }

    @Override
    public void doSomething() {
        super.doSomething();
    }

    public static int getNumberOfWheels() {
        return 3;
    }
}
