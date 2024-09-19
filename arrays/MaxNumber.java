public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 8, 41, 24, -2, 0, 8, 44, 0, -88, 99 };
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0, 5));
    }

    // imagine that array is not empty
    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxValue = arr[0];
        for(int j : arr) {
            if (maxValue < arr[j]) {
                maxValue = arr[j];
            }
        }
        return maxValue;

    }

    // max between a particular range
    static int maxRange(int[] arr, int start, int end) {
        if (end < start || arr == null) {
            return -1;
        }
        int maxValue = arr[start];
        for (int j : arr) {
            if (maxValue < arr[j]) {
                maxValue = arr[j];
            }
        }
        return maxValue;

    }
}
