package com.company;


import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {


        Person p1 = new Person("Kirill", 23, SexPerson.Male, "Russia");
        Person p2 = new Person("Eva", 23, SexPerson.Female, "German");
        Person p3 = new Person("Olga", 22, SexPerson.Female, "Belgia");
        Person p4 = new Person("Misha", 18, SexPerson.Male, "Russia");
        Person p5 = new Person("Tony", 14, SexPerson.Female, "Russia");
        Person p6 = new Person("Nill", 89, SexPerson.Male, "German");
        Person p7 = new Person("Kill", 40, SexPerson.Female, "Russia");
        Person p8 = new Person("Opus", 32, SexPerson.Male, "Belgia");
        Person p9 = new Person("Viktor", 19, SexPerson.Male, "Russia");


        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);


        var result = list.stream().collect(Collectors.groupingBy(Person::getSexPerson,mapping(Person::getAge,filtering(p->p>20,toList()))));
        System.out.println(result);


    }


}

