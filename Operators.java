public class Operators {
    public static void main(String[] args) {
        /*
         * Java Operators
         * Operators are used to perform operations on variables and values.
         * 
         * In the example below, we use the + operator to add together two values:
         */
        int z = 100 + 50;
        System.out.println(z);

        /*
         * Although the + operator is often used to add together two values, like in the
         * example above, it can also be used to add together a variable and a value, or
         * a variable and another variable:
         */
        // 150 (100 + 50)
        int sum1 = 100 + 50;
        // 400 (150 + 250)
        int sum2 = sum1 + 250;
        //// 800 (400 + 400)
        int sum3 = sum2 + sum1;

        System.out.println(sum3);

        /*
         * Java divides the operators into the following groups:
         * 
         * Arithmetic operators
         * Assignment operators
         * Comparison operators
         * Logical operators
         * Bitwise operators
         */

        /*
         * Arithmetic Operators
         * Arithmetic operators are used to perform common mathematical operations.
         */

        // Addition
        int x = 5;
        int y = 3;
        System.out.println(x + y);

        // Subtraction
        System.out.println(x - y);

        // Multiplication
        System.out.println(x * y);

        // Division
        System.out.println(x / y);

        // Modulus
        System.out.println(x % y);

        // Increment
        // Placed to the left
        System.out.println(++x);

        // Decrement (placed to the left)
        System.out.println(--x);

        /*
         * Java Assignment Operators
         * Assignment operators are used to assign values to variables.
         * 
         * In the example below, we use the assignment operator (=) to assign the value
         * 10 to a variable called x:
         */

        int x1 = 10;
        System.out.println(x1);

        /*
         * Addition assignment operator
         * Adds the value on the right side to the variable on the left.
         * Assigns the result back to the variable on the left.
         */
        x1 += 5;
        System.out.println(x1);

        /*
         * Subtraction assignment operator
         * 
         * Subtracts the value on the right side from the variable on the left.
         * Assigns the result back to the variable on the left.
         */
        x1 = 10;
        x1 -= 3;
        System.out.println(x1);

        /*
         * Multiplication assignment operator
         * Multiplies the variable on the left by the value on the right
         */
        x1 = 4;
        x1 *= 3;
        System.out.println(x1);

        /*
         * Division assignment operator
         * Divides the variable on the left by the value on the right.
         * 
         */
        x1 = 20;
        x1 /= 4;
        System.out.println(x1);

        /*
         * Modulus assignment operator
         * Calculates the remainder of dividing the variable on the left by the value on
         * the right.
         * Assignes the remainder back to the variable on the left
         */

        x1 = 10;
        x1 %= 3;
        System.out.println(x1);

        /*
         * Bitwise AND assignment operator
         * Performs a bitwise AND operation between variable on the left and the value
         * on the right.
         * Assigns the result back to the variable on the left
         */

        x1 = 6;
        x1 &= 3;
        System.out.println(x1);
        /*
         * 6 = 110
         * 3 = 011
         * & = 010 = 2
         */

        x1 = 6;
        x1 |= 3;
        /*
         * 6 = 110
         * 3 = 011
         * OR = 111 = 4+2+1 = 7
         * OR is true if any of the values is true
         */
        System.out.println(x1);

        /*
         * XOR assignment operator
         * Performes a bitwise XOR (exclusive OR) operation between teh variable on the
         * left and value on the right
         * Assigns the result on back on the valiable on the left
         */
        x1 = 5;
        x1 ^= 3;
        /*
         * 5 = 101
         * 3 = 011
         * XOR = 110 = 6
         */

        /*
         * Right shift assignment operator
         * Performes a right shift operation on the bits of the variable on the left by
         * the number of positions on the right
         */
        x1 = 8;
        x1 >>= 2;
        /*
         * 8 = 1000
         * >>=2 0010 = 2
         */

        /*
         * Left shift assigment operator
         * operator shifts bits to the left and fills the rightmost bits with 0s.
         * Each left shift effectively multiplies the number by 2, so this operator is
         * often used for efficient multiplications by powers of 2.
         * 
         */
        x1 = 3;
        x1 <<= 2;
        /*
         * 3 = 011
         * <<=2 = 1100 = 8+4 = 12
         */

        /*
         * Java Comparison Operators
         * Comparison operators are used to compare two values (or variables). This is
         * important in programming, because it helps us to find answers and make
         * decisions.
         * 
         * The return value of a comparison is either true or false. These values are
         * known as Boolean values,
         */
        x1 = 5;
        int y1 = 3;
        System.out.println(x1 > y1); // returns true, because 5 is higher than 3
        System.out.println(x1 == y1);
        System.out.println(x1 != y1);
        System.out.println(x1 < y1);
        System.out.println(x1 <= y1);
        System.out.println(x1 >= y1);

        /*
         * Java Logical Operators
         * You can also test for true or false values with logical operators.
         * 
         * Logical operators are used to determine the logic between variables or
         * values:
         */
        x1 = 5;
        System.out.println(x1 < 5 && x1 < 10);
        System.out.println(x1 < 5 || x1 < 10);
        System.out.println(!(x1 < 5 || x1 < 10));
    }
}
