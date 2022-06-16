package com.fasttrack.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex", null);

        Person person1 = PersonBuilder.builder().withName("Alex").build();
    }

}
