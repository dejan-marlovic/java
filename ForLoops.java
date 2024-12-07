public class ForLoops {
    public static void main(String[] args) {
        /*
         * Java For Loop
         * When you know exactly how many times you want to loop through a block of
         * code, use the for loop instead of a while loop:
         */

        /*
         * Statement 1 is executed (one time) before the execution of the code block.
         * 
         * Statement 2 defines the condition for executing the code block.
         * 
         * Statement 3 is executed (every time) after the code block has been executed.
         * 
         * The example below will print the numbers 0 to 4:
         */

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        /*
         * Example explained
         * Statement 1 sets a variable before the loop starts (int i = 0).
         * 
         * Statement 2 defines the condition for the loop to run (i must be less than
         * 5). If the condition is true, the loop will start over again, if it is false,
         * the loop will end.
         * 
         * Statement 3 increases a value (i++) each time the code block in the loop has
         * been executed.
         */

        // Statement 3 is executed (every time) after the code block has been executed.
        // This example will only print even values between 0 and 10:
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        /*
         * Nested Loops
         * It is also possible to place a loop inside another loop. This is called a
         * nested loop.
         * 
         * The "inner loop" will be executed one time for each iteration of the
         * "outer loop":
         */
        // outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // executes 2 times

            // inner loop
            for (int j = 1; j <= 3; j++) {
                System.err.println("Inner: " + j); // executes 2*3 times
            }

        }

        /*
         * For-Each Loop
         * There is also a "for-each" loop, which is used exclusively to loop through
         * elements in an array (or other data sets):
         */

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

        for (String i : cars) {
            System.out.println(i);
        }

        /*
         * Real-Life Examples
         * To demonstrate a practical example of the for loop, let's create a program
         * that counts to 100 by tens:
         */

        for (int i = 0; i <= 100; i += 10) {
            System.out.println(i);
        }
        // In this example, we create a program that only print even values between 0
        // and 10:

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        // And in this example, we create a program that prints the multiplication table
        // for a specified number:
        int number = 3;

        for (int i = 1; i <= 15; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
