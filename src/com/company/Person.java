package com.company;

public class Person {

   private String name;
   private int age;
   private SexPerson sexPerson;
   private String country;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public SexPerson getSexPerson() {
        return sexPerson;
    }

    public String getCountry() {
        return country;
    }

    public Person(String name, int age, SexPerson sexPerson, String country) {
        this.name = name;
        this.age = age;
        this.sexPerson = sexPerson;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person" +
                "name=" + name +
                " age=" + age +
                " sexPerson=" + sexPerson +
                " country='" + country + "\n";

    }
}
