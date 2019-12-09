package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<String> myStrinStream = Stream.of("Ala", "ma", "kota");
        myStrinStream.forEach(a -> {
            System.out.println(a);
        });
        System.out.println("----------------------");
        Stream.<String>builder()
                .add("Ala")
                .add("ma")
                .add("kota")
                .build()
                .filter(s -> s.startsWith("A"))
                .forEach(s -> System.out.println(s));
        System.out.println("---------------------------");

        Predicate<Person> nameStrartsWithAPredicate = p -> p.name.startsWith("A");
        Predicate<Person> ageBelow20Predicate = p -> p.age < 20;


        List<Person> people = Arrays.asList (
                new Person("Lukasz", 15),
        new Person("Ala", 15),
        new Person("Iwona", 5),
        new Person("Magda", 3),
        new Person("Alwksander", 19),
        new Person("Aleksander", 23));

        List<Person> listaPersonnaAponizej20 = people.stream().filter(nameStrartsWithAPredicate.and(ageBelow20Predicate))
                .collect(Collectors.toList());
        System.out.println(listaPersonnaAponizej20);


    }
}
//static void myVararg(String... s) {

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

