public class FloorElement {
    public static void main(String[] args) {
        int[] arr = {2,4,5,9,12,18,25};
        int target = 6;
        int ans = findfloor(arr, target);
        System.out.println(ans);
    }

    // greatest number less than or equal to target
    static int findfloor(int[] arr, int target) {
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
        return end;
    }
}
