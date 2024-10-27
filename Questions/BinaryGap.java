public class BinaryGap {
    public static void main(String[] args) {
        int N = 1041; // Example input
        int gapLength = binaryGap(N);
        System.out.println("The longest binary gap is: " + gapLength);
    }

    public static int binaryGap(int N) {
        // Convert the number to binary and store it in a string
        String binaryString = Integer.toBinaryString(N);
        
        int maxGap = 0;
        int currentGap = 0;
        boolean foundOne = false;

        for (char bit : binaryString.toCharArray()) {
            if (bit == '1') {
                if (foundOne) {
                    // Update the max gap if current gap is greater
                    maxGap = Math.max(maxGap, currentGap);
                }
                // Reset the current gap and mark that we've found a 1
                currentGap = 0;
                foundOne = true;
            } else if (foundOne) {
                // Increment the gap only if we have found a 1 before
                currentGap++;
            }
        }

        return maxGap;
    }
}
