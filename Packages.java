/**
 * Built-in Packages
 * <p>
 * The Java API is a library of prewritten classes, that are free to use, included in the Java
 * Development Environment.
 * <p>
 * The library contains components for managing input, database programming, and much much more. The
 * complete list can be found at Oracles website: https://docs.oracle.com/javase/8/docs/api/.
 * <p>
 * The library is divided into packages and classes. Meaning you can either import a single class
 * (along with its methods and attributes), or a whole package that contain all the classes that
 * belong to the specified package.
 * <p>
 * To use a class or a package from the library, you need to use the import keyword:
 */

import java.util.Scanner;

/**
 * java.util is a package, while Scanner is a class of the java.util package.
 * <p>
 * To use the Scanner class, create an object of the class and use any of the available methods
 * found in the Scanner class documentation. In our example, we will use the nextLine() method,
 * which is used to read a complete line:
 */

public class Packages {

    /**
     * Java Packages & API
     * <p>
     * A package in Java is used to group related classes. Think of it as a folder in a file
     * directory.
     * <p>
     * We use packages to avoid name conflicts, and to write  better maintainable code.
     * <p>
     * Packages are divided into two categories: Built-in Packages (packages from the Java API)
     * User-defined Packages (create your own packages)
     */
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter userName");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
/*
Import a Package
There are many packages to choose from. In the previous example,
we used the Scanner class from the java.util package.
This package also contains date and time facilities, random-number generator
and other utility classes.

To import a whole package, end the sentence with an asterisk sign (*).
The following example will import
ALL the classes in the java.util package:

import java.util.*;
 */