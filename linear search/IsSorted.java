public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 23, 23, 54, 77, 77};
        System.out.println(isSorted(arr));
    }

    // Checks if the array is sorted in non-decreasing order
    static boolean isSorted(int[] arr) {
        // Iterate through the array up to the second-to-last element
        for (int i = 1; i < arr.length; i++) {
            // Compare current element with the next one
            if (arr[i] >= arr[i - 1]) {
                // If the current element is greater, the array is not sorted
            } else {
                return false;
            }
        }
        // If the loop completes without finding any issues, the array is sorted
        return true;
    }
}
