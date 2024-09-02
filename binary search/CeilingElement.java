public class CeilingElement {
    public static void main(String[] args) {
        int[] arr = {2,4,5,9,12,18,25};
        int target = 11;
        int ans = findceiling(arr, target);
        System.out.println(ans);
    }

    // smallest number greater than or equal to target
    static int findceiling(int[] arr, int target) {
//        if(target > arr.length-1) {
//            return -1;
//        }
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target) {
                return  mid;
            }
            else if(arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}
