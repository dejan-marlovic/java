public class Recursion {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        int result1 = sumHaltingCondition(5, 10);
        System.out.println(result1);
    }

    /*
     * sum(10) = 10 + sum(9)
     * sum(10) = 10 + 9 + sum(8)
     * sum(10) = 10 + 9 + 8 + sum(7)
     * sum(10) = 10 + 9 + 8 + 7 + sum(6)
     * sum(10) = 10 + 9 + 8 + 7 + 6 + sum(5)
     * sum(10) = 10 + 9 + 8 + 7+ 6 + 5 + sum(4)
     * sum(10) = 10 + 9 + 8 + 7+ 6 + 5 + 4 + sum(3)
     * sum(10) = 10 + 9 + 8 + 7+ 6 + 5 + 4 + 3 + sum(2)
     * sum(10) = 10 + 9 + 8 + 7+ 6 + 5 + 4 + 3 + 2 + sum(1)
     * sum(10) = 10 + 9 + 8 + 7+ 6 + 5 + 4 + 3 + 2 + 1 + sum(0) -> (return 0)
     * Since the function does not call itself when k is 0, the program stops there
     * and returns the result.
     */

    public static int sum(int k) {
        if (k > 9) {
            return k + sum(k - 1);

        } else {
            return 0;
        }
    }

    static int sumHaltingCondition(int start, int end) {
        if (end > start) {
            return end + sumHaltingCondition(start, end - 1);
        } else
            return end;
    }

    /*
     * The developer should be very careful with recursion as it can be quite easy
     * to slip into writing a function which never terminates, or one that uses
     * excess amounts of memory or processor power. However, when written correctly
     * recursion can be a very efficient and mathematically-elegant approach to
     * programming.
     */
}
