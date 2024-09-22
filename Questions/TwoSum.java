import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 0, 8};
        int target = 13;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans)); // Print the result properly
    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // Check all pairs
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j}; // Return the indices of the two numbers
                }
            }
        }
        return new int[] {-1, -1}; // Return -1, -1 if no pairs found
    }
}
