/*
Java Variables

Variables are containers for storing data values.

In Java, there are different types of variables, for example:

String - stores text, such as "Hello". String values are surrounded by double quotes

int - stores integers (whole numbers), without decimals, such as 123 or -123

float - stores floating point numbers, with decimals, such as 19.99 or -19.99

char - stores single characters, such as 'a' or 'B'. Char values are surrounded 
by single quotes

boolean - stores values with two states: true or false 
 */

public class Variables {
    public static void main(String[] args) {
        String name = "John ";
        int myNum = 15;
        String firstname = "BIll ";
        String lastname = "Bhar";
        // You can also declare a variable without assigning the value,
        // and assign the value later:
        int myNum1;
        myNum1 = 45;
        final int myFinalNumber = 35;
        // myFinalNumber = 20; // will generate an error:
        // cannot assign a value to a final variable
        System.out.println(name);
        System.out.println(myNum);
        System.out.println(myNum1);
        System.out.println(myFinalNumber);

        System.out.println("Hello " + name);
        System.out.println(firstname + lastname);

        // For numeric values, the + character works as a mathematical operator
        // (notice that we use int (integer) variables here)

        int x = 5;
        int y = 6;
        System.out.println(x + y);

        // To declare more than one variable of the same type,
        // you can use a comma-separated list:
        int a = 5, b = 6, c = 5;

        System.out.println(a + b + c);

        // You can also assign the same value to multiple variables in one line:
        int e, f, g;
        e = f = g = 50;
        System.out.println(e + f + g);

        /*
         * Identifiers
         * All Java variables must be identified with unique names.
         * 
         * These unique names are called identifiers.
         * 
         * Identifiers can be short names (like x and y) or more descriptive names (age,
         * sum, totalVolume).
         * 
         * Note: It is recommended to use descriptive names in order to create
         * understandable and maintainable code:
         */

        /*
         * Names can contain letters, digits, underscores, and dollar signs
         * Names must begin with a letter
         * Names should start with a lowercase letter, and cannot contain whitespace
         * Names can also begin with $ and _
         * Names are case-sensitive ("myVar" and "myvar" are different variables)
         * Reserved words (like Java keywords, such as int or boolean) cannot be used as
         * names
         */

        /*
         * Practical examples varible naming:
         */

        String studentName = "John Doe";
        int studentID = 15, studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print variables

        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade:: " + studentGrade);

        int length = 4;
        int width = 6;
        int area;

        area = length * width;

        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);
    }
}
