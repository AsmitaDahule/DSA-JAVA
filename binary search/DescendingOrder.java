public class DescendingOrder {
    public static void main(String[] args) {
        // create array
        int[] arr = { 165,84,55,35,22,14,-2,-65 };
        // target element 
        int target = 35;
        int ans = binarysearch(arr, target); // call binarysearch function
        System.out.println(ans);
    }

    // binary search function which return the index
    static int binarysearch(int[] arr, int target) {
        int start = 0; 
        int end = arr.length - 1;

        // checking condition whether start <= end or not
        while (start <= end) {
            int mid = start + (end - start) / 2; // finding middle index
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1; // element not present in given array then return -1
    }
}