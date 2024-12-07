public class BreakContinue {
    public static void main(String[] args) {
        /*
         * break statement can be used to jump out of a loop.
         * 
         * This example stops the loop when i is equal to 4:
         */
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            // four will not be printed
            if (i == 4) {
                continue;
            }
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
    }
}
