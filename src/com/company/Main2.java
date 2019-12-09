package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        List<String> upperCaseList = Arrays.asList("A", "B", "C", "D");
        List<String> loweCaseList =
                upperCaseList.stream().map(a -> a.toLowerCase()) // .map (String::toLoweCase)
                        .collect(Collectors.toList());
        System.out.println(loweCaseList);


        List<Person2> personList = new ArrayList<>();
        personList.add(new Person2("Ala","Kowlska"));
        personList.add(new Person2("Jan","Kowlski"));
        personList.add(new Person2("Filip","Michalk"));
        personList.add(new Person2("Ola","Niedzielska"));
        personList.add(new Person2("Kasia","Pawłowska"));

        List<String> namesList = personList.stream().map(s -> s.name).
                collect(Collectors.toList());
        System.out.println(namesList);

        List<String> toUpperCaseList = personList.stream().map(s -> s.name.toUpperCase()).collect(Collectors.toList());
        List<String> listaImion = personList.stream().map(s -> s.name.toUpperCase() +" "+ s.lastName.toUpperCase()).collect(Collectors.toList());
        System.out.println(listaImion);
        System.out.println(toUpperCaseList);

        String [][] data= new String [][] {{"a","b"},{"c","d"},{"e", "f"}};
        Stream<String[]> strumienTablic = Arrays.stream(data);
        Stream<String> strumienStringow = strumienTablic.flatMap(arr -> Arrays.stream(arr));

        List<String> odfiltorwanaLista = strumienStringow.filter(a -> !a.equals("e"))
                .map(a -> a.toUpperCase())
        .collect(Collectors.toList());
        System.out.println(odfiltorwanaLista);





    }
}