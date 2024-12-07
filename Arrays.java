public class Arrays {
    public static void main(String[] args) {

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        System.out.println(cars[0]);
        cars[0] = "Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);

        /*
         * You can loop through the array elements with the for loop, and use the length
         * property to specify how many times the loop should run.
         * 
         * The following example outputs all elements in the cars array:
         */

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        // There is also a "for-each" loop, which is used exclusively to loop through
        // elements in arrays:
        for (String i : cars) {
            System.out.println(i);
        }

        /*
         * The example above can be read like this: for each String element (called i -
         * as in index) in cars, print out the value of i.
         * 
         * If you compare the for loop and for-each loop, you will see that the for-each
         * method is easier to write, it does not require a counter (using the length
         * property), and it is more readable.
         */

        int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };

        float avg, sum = 0;

        int length = ages.length;

        for (int age : ages) {
            sum += age;
        }

        avg = sum / length;

        System.out.println("The average age is: " + avg);

        int lowestAge = ages[0];

        for (int age : ages) {
            // Check if the current age is smaller than the current 'lowest age'
            if (age < lowestAge) {
                // If the smaller age is found, update 'lowest age' with that element
                lowestAge = age;
            }
        }
        System.out.println("The lowest age in the array is: " + lowestAge);

        /*
         * Multidimensional Arrays
         * A multidimensional array is an array of arrays.
         * 
         * Multidimensional arrays are useful when you want to store data as a tabular
         * form, like a table with rows and columns.
         * 
         * To create a two-dimensional array, add each array within its own set of curly
         * braces:
         */

        int[][] myNumbers = { { 1, 2, 3 }, { 5, 6, 7 } };

        /*
         * Access Elements
         * To access the elements of the myNumbers array, specify two indexes: one for
         * the array, and one for the element inside that array. This example accesses
         * the third element (2) in the second array (1) of myNumbers:
         */
        // This example accesses the third element (2) in the second array (1) of
        // myNumbers:
        System.out.println(myNumbers[1][2]);

        /*
         * Loop Through a Multi-Dimensional Array
         * You can also use a for loop inside another for loop to get the elements of a
         * two-dimensional array (we still have to point to the two indexes):
         */

        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        // easier to read and write
        for (int[] row : myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}
