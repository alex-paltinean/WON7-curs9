package com.fasttrack.inheritance;

public class Bike {
    private int tyrePressure;
    public int speed;

    public Bike(int tyrePressure) {
        this.tyrePressure = tyrePressure;
    }

    public void increaseSpeed(int increment) {
        System.out.println("Bike implementation");
        this.speed += increment;
    }

    public void stop() {
        this.speed = 0;
    }

    public void flatTyre() {
        this.tyrePressure = 0;
    }

    public void inflateTyre(int amount) {
        this.tyrePressure += amount;
    }

    protected void doSomething() {
        System.out.println("do something");
    }

    public static int getNumberOfWheels() {
        return 2;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "tyrePressure=" + tyrePressure +
                ", speed=" + speed +
                '}';
    }
}
