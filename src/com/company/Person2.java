package com.company;

public class Person2 {
    String name;
    String lastName;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Person2(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;


    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}