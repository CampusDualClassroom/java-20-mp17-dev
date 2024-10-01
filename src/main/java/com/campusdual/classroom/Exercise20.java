package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("John", "Smith"));
        personList.add(new Teacher("María", "Montessori", "Educación"));
        personList.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
        personList.add(new Doctor("Gregory", "House", "Nefrología e infectología"));
        return personList;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        stringList.forEach(Person::getDetails);
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
