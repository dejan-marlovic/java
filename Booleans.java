public class Booleans {
    public static void main(String[] args) {

        /*
         * Very often, in programming, you will need a data type that can only have one
         * of two values, like:
         * 
         * YES / NO
         * ON / OFF
         * TRUE / FALSE
         * For this, Java has a boolean data type, which can store true or false values.
         * A boolean type is declared with the boolean keyword and can only take the
         * values true or false:
         */

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        /*
         * A Boolean expression returns a boolean value: true or false.
         * 
         * This is useful to build logic, and find answers.
         * 
         * For example, you can use a comparison operator, such as the greater than (>)
         * operator, to find out if an expression (or a variable) is true or false:
         */

        int x = 10;
        int y = 9;
        System.out.println(x > y);
        System.out.println(10 > 9);
        System.out.println(x == 10);

        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("You are orld enough to vote!");
        } else {
            System.out.println("You are not old enough to vote!");
        }
    }
}
