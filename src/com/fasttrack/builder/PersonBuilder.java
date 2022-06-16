package com.fasttrack.builder;

public class PersonBuilder {

    private String name;
    private Integer age;

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public PersonBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder withAge(Integer age) {
        this.age = age;
        return this;
    }

    public Person build() {
        return new Person(name, age);
    }
}
