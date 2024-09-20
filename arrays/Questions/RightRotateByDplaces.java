public class RightRotateByDplaces {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int d = 3;

        // Call the method to rotate the array
        rightRotate(arr, d);

        // Print the rotated array
        System.out.print("Rotated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void rightRotate(int[] arr, int d) {
        int n = arr.length;

        // Normalize d in case it's greater than n
        d = d % n;

        // Create a new array to hold the rotated version
        int[] rotatedArray = new int[n];

        // Place elements in their new positions
        for (int i = 0; i < n; i++) {
            // Calculate the new position
            int newPos = (i + d) % n;
            rotatedArray[newPos] = arr[i];
        }

        // Copy the rotated array back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = rotatedArray[i];
        }
    }
}
