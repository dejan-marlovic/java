public class IfElse {

    public static void main(String[] args) {

        /*
         * less than and greater than signs go first before than equal sign.
         * >=
         * <=
         * 
         * Less than: a < b
         * Less than or equal to: a <= b
         * Greater than: a > b
         * Greater than or equal to: a >= b
         * Equal to a == b
         * Not Equal to: a != b
         */

        /*
         * Use if to specify a block of code to be executed, if a specified condition is
         * true
         * 
         * Use else to specify a block of code to be executed, if the same condition is
         * false
         * 
         * Use else if to specify a //new// condition to test, if the first condition is
         * false // if first condition is false test new condition!! //.
         * 
         * Use switch to specify many alternative blocks of code to be executed
         */

        /*
         * The else Statement
         * 
         * Use the else statement to specify a block of code to be executed if the
         * condition is false.
         */

        int time = 20;
        if (time < 18) {
            System.out.println("Good day!");
            // if statement is false, runs else statement
        } else {
            System.out.println("Good evening");
        }

        /*
         * The else if Statement
         * Use the else if statement to specify a new condition if the first condition
         * is false
         */

        /*
         * if (condition1) {
         * // block of code to be executed if condition1 is true
         * } else if (condition2) {
         * // block of code to be executed if the condition1 is false and condition2 is
         * true
         * } else {
         * // block of code to be executed if the condition1 is false and condition2 is
         * false
         * }
         */

        int time1 = 22;

        if (time1 < 10) {
            // this block is false
            System.out.println("Good morgning!");
        } else if (time1 < 18) {
            // this block is false
            System.out.println("Good day!");
        } else {
            System.out.println("Good evening!");
        }
        /*
         * In the example above, time (22) is greater than 10, so the first condition is
         * false. The next condition, in the else if statement, is also false, so we
         * move on to the else condition since condition1 and condition2 is both false -
         * and print to the screen "Good evening".
         * 
         * However, if the time was 14, our program would print "Good day."
         */

        /*
         * Short Hand if...else
         * There is also a short-hand if else, which is known as the ternary operator
         * because it consists of three operands.
         * 
         * It can be used to replace multiple lines of code with a single line, and is
         * most often used to replace simple if else statements:
         */

        int time2 = 20;
        String result = (time2 < 18) ? "Good day!" : "Good evening!";
        System.out.println(result);

        int doorCode = 1337;

        if (doorCode == 1337) {
            System.err.println("Correct code. The door is now open!");
        } else {
            System.out.println("Wrong code. The door remains closed.");
        }

        int myNum = 10;

        if (myNum > 0) {
            System.out.println("Number is positive!");
        } else if (myNum < 0) {
            System.out.println("Number is negative!");
        } else {
            System.out.println("Number is 0");
        }

        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("You can vote!");
        } else {
            System.out.println("You can not vote!");
        }

        int myNum1 = 5;

        if (myNum1 % 2 == 0) {
            System.out.println(myNum1 + " is even!");
        } else {
            System.out.println(myNum1 + " is odd!");
        }
    }

}
