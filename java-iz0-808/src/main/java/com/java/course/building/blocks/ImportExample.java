package com.java.course.building.blocks;

/*
    Classes in the same package are often imported together. You can use a shortcut to import
    all the classes in a package:
 */
import java.util.*; // imports java.util.Random among other things

// import java.util.Random; // import tells us where to find Random

/*
    There’s one special package in the Java world called java.lang. This package is
    special in that it is automatically imported. You can still type this package in an import
    statement, but you don’t have to.
 */
import java.lang.System;
import java.lang.*;


import java.nio.file.*;
/*
    import java.nio.*; // NO GOOD – a wildcard only matches class names, not "file.*Files".
    import java.nio.*.*; // NO GOOD – you can only have one wildcard and it must be at the end.
    import java.nio.files.Paths.*; // NO GOOD – you cannot import methods only class names.
 */

public class ImportExample {

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }

    public void read(Files files) {
        Paths.get("name");
    }

    /*
        In order to avoid package conflicts we should set the full package.
     */
    public void namingConflicts() {
        java.sql.Date dateSql = new java.sql.Date(1);
        Date dateUtil = new Date();
    }
}
