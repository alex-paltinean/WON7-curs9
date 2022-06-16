package com.fasttrack.inheritance.diamondInterface;

public class PegasBike implements MountainBike, StreetBike {
    @Override
    public void doSomething() {
        System.out.println("do something");
    }

    public static void main(String[] args) {
        PegasBike pegasBike = new PegasBike();
        pegasBike.doSomething();

        StreetBike streetBike = pegasBike;
        streetBike.doSomething();

        MountainBike mountainBike = pegasBike;
        streetBike.doSomething();

        Bike bike = pegasBike;
        bike.doSomething();
    }
}
