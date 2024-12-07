public class Methods {
    static void myMethod() {
        System.out.println("I just got executed");
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
        greet("Liam", 20);
        greet("Jenny", 25);
        greet("Anja", 13);
        checkAge(20);
        checkAge(13);
        System.out.println(addFive(3));
        int z = sumInt(33, 22);
        System.out.println(z);

        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }

    /*
     * myMethod() is the name of the method
     * static means that the method belongs to the Main class and not an object of
     * the Main class. You will learn more about objects and how to access methods
     * through objects later in this tutorial.
     * void means that this method does not have a return value. You will learn more
     * about return values later in this chapter
     */

    /*
     * Information can be passed to methods as a parameter. Parameters act as
     * variables inside the method.
     * 
     * Parameters are specified after the method name, inside the parentheses. You
     * can add as many parameters as you want, just separate them with a comma.
     * 
     * The following example has a method that takes a String called fname as
     * parameter. When the method is called, we pass along a first name, which is
     * used inside the method to print the full name:
     */

    static void greet(String fname, int age) {
        System.out.println("Hi my name is " + fname + " and I'm " + age + " old !");

    }

    /*
     * When a parameter is passed to the method, it is called an argument. So, from
     * the example above: fname is a parameter, while Liam, Jenny and Anja are
     * arguments.
     */

    /*
     * Note that when you are working with multiple parameters, the method call must
     * have the same number of arguments as there are parameters, and the arguments
     * must be passed in the same order.
     */
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("You are not old enough!");
        } else {
            System.out.println("You are old enough!");
        }
    }

    /*
     * If you want the method to return a value, you can use a primitive data type
     * (such as int, char, etc.) instead of void, and use the return keyword inside
     * the method:
     */
    static int addFive(int x) {
        return 5 + x;
    }

    static int sumInt(int x, int y) {
        return x + y;
    }

    /*
     * Method Overloading
     * With method overloading, multiple methods can have the same name with
     * different parameters:
     * 
     * int myMethod(int x)
     * float myMethod(float x)
     * double myMethod(double x, double y)
     * 
     * Consider the following example, which has two methods that add numbers of
     * different type:
     * 
     * static int plusMethodInt(int x, int y) {
     * return x + y;
     * }
     * 
     * static double plusMethodDouble(double x, double y) {
     * return x + y;
     * }
     * 
     * public static void main(String[] args) {
     * 
     * int myNum1 = plusMethodInt(8, 5);
     * 
     * double myNum2 = plusMethodDouble(4.3, 6.26);
     * 
     * System.out.println("int: " + myNum1);
     * 
     * System.out.println("double: " + myNum2);
     * }
     * 
     * Instead of defining two methods that should do the same thing, it is better
     * to overload one.
     * 
     * In the example below, we overload the plusMethod method to work for both int
     * and double:
     */
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }
    /*
     * Note: Multiple methods can have the same name as long as the number and/or
     * type of parameters are different.
     */
}
