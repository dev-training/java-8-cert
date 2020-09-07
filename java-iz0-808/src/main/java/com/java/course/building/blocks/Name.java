package com.java.course.building.blocks;

public class Name {

    // You can even read and write fi elds directly on the line declaring them:
    String first = "Abrahan";// instance variable
    String last = "Romero";// instance variable
    String full = first + last;// instance variable

    int numberEggs;// instance variable

    public static void main(String[] args) {
        Name name = new Name(); // Creating a object.
        System.out.println(name.first);
        System.out.println(name.last);
        System.out.println(name.full);

        name.numberEggs = 1; // set variable
        System.out.println(name.numberEggs); // read variable
    }
}
