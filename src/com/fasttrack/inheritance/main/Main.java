package com.fasttrack.inheritance.main;

import com.fasttrack.inheritance.Bike;
import com.fasttrack.inheritance.MountainBike;

public class Main {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(10);
        mountainBike.increaseSpeed(10);
        mountainBike.increaseSpeed(5);
        System.out.println(mountainBike);

        Bike b = mountainBike;

        Bike bike = new MountainBike(15);
        MountainBike fromBike = (MountainBike) bike;
        fromBike.increaseSuspensionStrength();

        ((MountainBike) bike).increaseSuspensionStrength();

        Bike bikeToPrint = new MountainBike(15);
        printBike(bikeToPrint);

//        bikeToPrint.doSomething(); -- isn't visible
        fromBike.doSomething();

        int numberOfWheels = MountainBike.getNumberOfWheels();
        System.out.println(numberOfWheels);

        mountainBike.increaseSuspensionStrength(2);
        int speed = ((Bike) mountainBike).speed;
        String speedString = mountainBike.speed;
        int speedFromParent = mountainBike.getSpeed();
    }

    public static void printBike(Bike bike) {
        System.out.println(bike.toString());
    }
}
