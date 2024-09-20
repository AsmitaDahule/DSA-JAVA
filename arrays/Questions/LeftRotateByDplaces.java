public class LeftRotateByDplaces {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int d = 9;

        // Call the method to rotate the array
        rotatedArray(arr, d);

        // Print the rotated array
        System.out.print("Rotated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void rotatedArray(int[] arr, int d) {
        int n = arr.length;

        // Normalize d in case it's greater than n
        d = d % n;

        // Create a temporary array to hold the first d elements
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Shift the rest of the array to the left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Copy the elements from the temporary array back to the end of the original array
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }
}
