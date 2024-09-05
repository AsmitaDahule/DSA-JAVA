// Cognizant interview question
// hamming distance - given a two number in decimal then we have to convert it into bianry and check the
// each digit with  its corresponding index if it is same then return 0 else return 1
// and we have to return a count of 0's that is hamming distance
public class HammingDistance {
    public static void main(String[] args) {
        // Example usage
        int a = 5; // Binary: 0101
        int b = 9; // Binary: 1001
        System.out.println("Hamming Distance: " + hammingdist(a, b)); // Output: 2
    }

    static int hammingdist(int a, int b) {
        // XOR the two numbers
        int c = a ^ b;
        // Count the number of set bits in the XOR result
        return countSetBits(c);
    }

    static int countSetBits(int n) {
        int count = 0;
        // Iterate through all bits of the integer
        while (n > 0) {
            // Increment count if the last bit is 1
            count += (n & 1);
            // Right shift the number by 1 bit
            n >>= 1;
        }
        return count;
    }
}

