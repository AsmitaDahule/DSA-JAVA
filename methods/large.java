public class large {
    public static void main(String[] args) {
        int[] arr = { 3, 34, 23, 1, 65, 3, 68, 90, 8, 23,5};
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("largest number = " + max);
    }
}
