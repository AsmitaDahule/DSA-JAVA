public class ThreeDigitArmstrong {
    public static void main(String[] args) {
        int fnum = 100;
        int lnum = 1000;
        
    }

    static void isArmstrong(int fnum, int lnum) {
        for (int i = fnum; i < lnum; i++) {
            int original = i;
            int sum = 0;

            // Extract digits and compute the sum of cubes using a loop
            while (original > 0) {
                int rem = original % 10; // Extract the last digit
                sum += rem * rem * rem; // Add the cube of the digit to sum
                original /= 10; // Remove the last digit
            }

            // Check if the number is an Armstrong number
            if (i == sum) {
                System.out.println(i);
            }
        }
    }

}
