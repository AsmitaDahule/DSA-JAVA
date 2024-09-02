import java.util.Arrays;

class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8,8,8, 10};
        int target = 8;
        int[] a = searchRange(nums,target);
        System.out.println(Arrays.toString(a));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }

    // return index
    static int search(int[] nums, int target, boolean leftposition) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start)/2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;

                if (leftposition) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return ans;

    }
}