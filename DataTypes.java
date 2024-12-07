public class DataTypes {
    public static void main(String[] args) {
        int myNum = 5;
        // float needs "f" at the end
        float myFloatNum = 5.99f;
        // needs to be insade '' to be of type char
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        /*
         * Data types are divided into two groups:
         * 
         * Primitive data types - includes byte, short, int, long, float, double,
         * boolean and char
         * 
         * Non-primitive data types - such as String, Arrays and Classes
         */

        /*
         * Primitive Data Types
         * A primitive data type specifies the size and type of variable values, and it
         * has no additional methods.
         */

        /*
         * Data Type Size Description
         * byte 1 byte Stores whole numbers from -128 to 127
         * short 2 bytes Stores whole numbers from -32,768 to 32,767
         * int 4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
         * long 8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to
         * 9,223,372,036,854,775,807
         * 
         * float 4 bytes Stores fractional numbers. Sufficient for storing 6 to 7
         * decimal digits
         * 
         * double 8 bytes Stores fractional numbers. Sufficient for storing 15 decimal
         * digits
         * boolean 1 bit Stores true or false values
         * char 2 bytes Stores a single character/letter or ASCII values
         */

        /*
         * Numbers
         * Primitive number types are divided into two groups:
         * 
         * Integer types stores whole numbers, positive or negative (such as 123 or
         * -456), without decimals. Valid types are byte, short, int and long. Which
         * type you should use, depends on the numeric value.
         * 
         * Floating point types represents numbers with a fractional part, containing
         * one or more decimals. There are two types: float and double.
         */

        /*
         * Integer Types
         * Byte
         * The byte data type can store whole numbers from -128 to 127. This can be used
         * instead of int or other integer types to save memory when you are certain
         * that the value will be within -128 and 127:
         */
        byte myNum1 = 100;
        System.out.println(myNum1);

        /*
         * Short 2 bytes
         * The short data type can store whole numbers from -32768 to 32767:
         */
        short myNum2 = 5000;
        System.out.println(myNum2);

        /*
         * Int 4 bytes
         * The int data type can store whole numbers from -2147483648 to 2147483647. In
         * general, and in our tutorial, the int data type is the preferred data type
         * when we create variables with a numeric value.
         */

        int myNum3 = 10000;
        System.out.println(myNum3);

        /*
         * Long 8 bytes
         * The long data type can store whole numbers from -9223372036854775808 to
         * 9223372036854775807. This is used when int is not large enough to store the
         * value. Note that you should end the value with an "L":
         */

        long myNum4 = 150000000000000L;
        System.out.println(myNum4);

        /*
         * Floating Point Types
         * You should use a floating point type whenever you need a number with a
         * decimal, such as 9.99 or 3.14515.
         * 
         * The float and double data types can store fractional numbers. Note that you
         * should end the value with an "f" for floats and "d" for doubles:
         */

        float myNum5 = 5.75f;
        System.out.println(myNum5);

        double myNum6 = 19.99d;
        System.out.println(myNum6);
        /*
         * Use float or double?
         * 
         * The precision of a floating point value indicates how many digits the value
         * can have after the decimal point. The precision of float is only six or seven
         * decimal digits, while double variables have a precision of about 15 digits.
         * Therefore it is safer to use double for most calculations.
         */

        /*
         * Scientific Numbers
         * A floating point number can also be a scientific number with an "e" to
         * indicate the power of 10:
         */

        float f1 = 35e3f;
        double d1 = 12e4d;
        System.out.println(f1);
        System.out.println(d1);

        /*
         * Java Boolean Data Types
         * Very often in programming, you will need a data type that can only have one
         * of two values, like:
         * 
         * YES / NO
         * ON / OFF
         * TRUE / FALSE
         */
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        /*
         * Characters
         * The char data type is used to store a single character. The character must be
         * surrounded by 'single quotes', like 'A' or 'c':
         */

        char myGrade = 'B';
        System.out.println(myGrade);

        /*
         * Alternatively, if you are familiar with ASCII values, you can use those to
         * display certain characters:
         */
        // we can use comma and state type only once
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        /*
         * Strings
         * The String data type is used to store a sequence of characters (text).
         * String values must be surrounded by double quotes:
         */

        String greeting = "Hello Wold";
        System.out.println(greeting);

        /*
         * The String type is so much used and integrated in Java, that some call it
         * "the special ninth type".
         * 
         * A String in Java is actually a non-primitive data type, because it refers to
         * an object. The String object has methods that are used to perform certain
         * operations on strings.
         */

        /*
         * Real-Life Example
         * Here's a real-life example of using different data types, to calculate and
         * output the total cost of a number of items:
         */

        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        System.out.println("Number of items: " + items);
        System.out.println("Cost per item:" + costPerItem + currency);
        System.out.println("Total cost " + totalCost + currency);

        /*
         * Non-Primitive Data Types
         * Non-primitive data types are called reference types because they refer to
         * objects.
         * 
         * The main difference between primitive and non-primitive data types are:
         * 
         * Primitive types in Java are predefined and built into the language, while
         * non-primitive types are created by the programmer (except for String).
         * Non-primitive types can be used to call methods to perform certain
         * operations, wheras primitive types cannot.
         * Primitive types start with a lowercase letter (like int), while non-primitive
         * types typically starts with an uppercase letter (like String).
         * Primitive types always hold a value, wheras non-primitive types can be null.
         * Examples of non-primitive types are Strings, Arrays, Classes etc.
         */
    }
}
