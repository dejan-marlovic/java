public class Strings {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting);
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the string is: " + txt.length());
        String txt1 = "Hello world!";
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());

        // The indexOf() method returns the index (the position) of the first occurrence
        // of a specified text in a string (including whitespace):

        /*
         * Java counts positions from zero.
         * 0 is the first position in a string, 1 is the second, 2 is the third ...
         */
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate"));
        String firstname = "John ";
        String lastname = "Doe";
        System.out.println(firstname + " " + lastname);
        System.out.println(firstname.concat(lastname));

        /*
         * WARNING!
         * 
         * Java uses the + operator for both addition and concatenation.
         * 
         * Numbers are added. Strings are concatenated.
         */

        String x = "10";
        String y = "20";
        String z = x + y;
        System.out.println(z);

        String x1 = "10";
        int y1 = 20;
        String z1 = x1 + y1;
        System.out.println(z1);

        /*
         * Because strings must be written within quotes, Java will misunderstand this
         * string, and generate an error.
         * 
         * The solution to avoid this problem, is to use the backslash escape character.
         * 
         * The backslash (\) escape character turns special characters into string
         * characters:
         * 
         * Escape character Result Description
         * \' ' Single quote
         * \"	" Double quote
         * \\ \ Backslash
         */

        String txt3 = "We are the so called \"Vikings\" of the north";
        System.out.println(txt3);
        /*
         * \r Carriage Return
         * moves the cursor to the beginning of the line
         * 
         * Other common escape sequences that are valid in Java are:
         * 
         * Code Result Try it
         * \n New Line
         * \r Carriage Return. Moves the cursor to the beginning of the line
         * \t Tab
         * \b Backspace <- also removes characther
         * \f Form Feed
         * 
         */
        String txt4 = "\t\tHel\blo \r World!";
        System.out.println(txt4);
    }

}
