package com.java.course.building.blocks;

public class Chick extends ParentClass {

    int numEggs = 0; // initialize on line
    String name = "Fluffy";

    // Instance code block.
    {
        System.out.println("Code block in class. Name : " + name);
    }

    /*
        It’s called a constructor, which is a special type of method that creates a new object.
        There are two key points to note about the constructor: the name of the constructor matches the name
        of the class, and there’s no return type.

        The purpose of a constructor is to initialize fields, although you can put any code in there.
     */
    public Chick() {
        name = "Duke"; // initialize in constructor
        System.out.println("Constructor()");
    }


    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
        // Instance Code block.
        {
            System.out.println("Code block in method. ");
        }
    }
}
