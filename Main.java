/*
 * In Java, every application begins with a class name,
 * and that class must match the filename.
 */

/*
 Every line of code that runs in Java must be inside a class. 
 And the class name should always start with an uppercase first letter. 
 In our example, we named the class Main.

 Java is case-sensitive: "MyClass" and "myclass" has different meaning.
 every program must contain the main() method.
 */
public class Main {
    public static void main(String[] args) {
        /*
         * System is a built-in Java class that contains useful members,
         * such as out, which is short for "output". The println() method, short
         * for "print line", is used to print a value to the screen (or a file).
         */
        System.out.println("Hello World!");
        System.out.println("I'm learning java.");
        System.out.print("It is awesome!");
        System.out.print(" I will print on the same line!");

        /*
         * You can also use the println() method to print numbers.
         * However, unlike text, we don't put numbers inside double quotes:
         */
        System.out.println(3);
        System.out.println(358);
        System.out.println(5000000);

        /*
         * You can also perform mathematical calculations
         * inside the println() method:
         */

        System.out.println(3 + 3);
        System.out.println(2 * 5);
    }
}