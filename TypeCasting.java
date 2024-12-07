/*
 * Java Type Casting
 *  Type casting is when you assign a value of one primitive data type to another type.
 */

/*
 * In Java, there are two types of casting:

    Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte

 */

public class TypeCasting {
    public static void main(String[] args) {
        /*
         * Widening Casting
         * Widening casting is done automatically when passing a smaller size
         * type to a larger size type:
         */
        int myInt = 9;
        // Widening Casting
        // Widening casting is done automatically when passing a smaller size type to a
        // larger size type:
        // double is larger than int.
        // double = 8 bytes
        // int = 4 bytes
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        /*
         * Narrowing Casting
         * Narrowing casting must be done manually by placing the type in parentheses ()
         * in front of the value:
         */
        double myDouble1 = 9.78d;
        // Manual casting: double to int
        int myInt1 = (int) myDouble;
        System.out.println(myDouble1);
        System.out.println(myInt1);

        /*
         * Real-Life Example
         * Here's a real-life example of type casting where we create a program to
         * calculate the percentage of a user's score in relation to the maximum score
         * in a game.
         * 
         * We use type casting to make sure that the result is a floating-point value,
         * rather than an integer:
         */

        int maxScore = 500;
        int userScore = 423;
        float percentage = (float) userScore / maxScore * 100.0f;
        System.out.println("User percentage is " + percentage);
    }
}
