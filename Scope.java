public class Scope {
    public static void main(String[] args) {
        /*
         * Java Scope
         * In Java, variables are only accessible inside the region they are created.
         * This is called scope.
         */

        /*
         * Method Scope
         * Variables declared directly inside a method are available anywhere in the
         * method following the line of code in which they were declared:
         */

        /*
         * A block of code may exist on its own or it can belong to an if, while or for
         * statement. In the case of for statements, variables declared in the statement
         * itself are also available inside the block's scope.
         */

        // Can not be useid if inside it's own block
        // {

        int x = 100;
        // }

        // Code here can use x
        System.out.println(x);

        /*
         * Block Scope
         * A block of code refers to all of the code between curly braces {}.
         * 
         * Variables declared inside blocks of code are only accessible by the code
         * between the curly braces, which follows the line in which the variable was
         * declared:
         */

        /*
         * Java Recursion
         * Recursion is the technique of making a function call itself. This technique
         * provides a way to break complicated problems down into simple problems which
         * are easier to solve.
         * 
         * Recursion may be a bit difficult to understand. The best way to figure out
         * how it works is to experiment with it.
         */

        /*
         * Java Recursion
         * Recursion is the technique of making a function call itself. This technique
         * provides a way to break complicated problems down into simple problems which
         * are easier to solve.
         * 
         * Recursion may be a bit difficult to understand. The best way to figure out
         * how it works is to experiment with it.
         */
    }
}
