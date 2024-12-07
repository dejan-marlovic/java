public class Maths {
    public static void main(String[] args) {
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));

        // returns double
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7));

        /*
         * Math.random() returns a random (double) number between 0.0 (inclusive), and
         * 1.0
         * (exclusive):
         */
        System.out.println(Math.random());

        /*
         * To get more control over the random number, for example, if you only want a
         * random number between 0 and 100, you can use the following formula:
         */
        // we need to add parentheses here otherwise we will get 0 every time
        // (Math.random() * 101)
        int randomNum = (int) (Math.random() * 101);
        System.out.println(randomNum);
    }
}
