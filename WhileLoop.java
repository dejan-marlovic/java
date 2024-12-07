public class WhileLoop {
    public static void main(String[] args) {

        /*
         * Java While Loop
         * The while loop loops through a block of code as long as a specified condition
         * is true.
         * In the example below, the code in the loop will run, over and over again, as
         * long as a variable (i) is less than 5:
         */
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            // Do not forget to increase the variable used in the condition, otherwise the
            // loop will never end!
            i++;
        }

        /*
         * The Do/While Loop
         * 
         * The do/while loop is a variant of the while loop. This loop will execute the
         * code block once, before checking if the condition is true, then it will
         * repeat the loop as long as the condition is true.
         * (good for check input scenarios?)
         */

        /*
         * The example below uses a do/while loop. The loop will always be executed at
         * least once, even if the condition is false, because the code block is
         * executed before the condition is tested:
         */

        int j = 0;

        do {
            System.out.println(j);
            j++;
        } while (j < 5);

        /*
         * Real-Life Examples
         * To demonstrate a practical example of the while loop, we have created a
         * simple "countdown" program:
         */

        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy new year!!");

        /*
         * To demonstrate a practical example of the while loop combined with an if else
         * statement, let's say we play a game of Yatzy:
         */
        int dice = 1;
        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }
    }
}
