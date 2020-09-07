package com.java.course.building.blocks;

/**
 * Java classes have two primary elements: methods, often called functions or procedures in
 * other languages, and fields, more generally known as variables. Together these are called the
 * members of the class. Variables hold the state of the program, and methods operate on that
 * state.
 *
 * If you do have a public class, it needs to match the filename Animal.java .
 */
public class Animal {

    String name;

    public String getName() {
        return name;
    }
    /*
        The full declaration of a method is called a method signature.
            public void setName(String name)
     */
    public void setName(String name) {
        this.name = name;
    }

}

/*
  You can even put two classes in the same file. When you do so, at most one of the classes
  in the file is allowed to be public.
 */
class Animal2 {

}