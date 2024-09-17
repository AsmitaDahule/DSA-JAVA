class DuplicateRotetedArray {
    public static void main(String[] args) {
        int[] arr = {4,4,5,3,4,4};
        int target =2;
        System.out.println(findPivot(arr));
        System.out.println(search(arr,target));
    }

    static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        // if pivot is not found means the array is not rotated just do simple binary search
        if(pivot == -1){
            return binarysearch(nums,target,0,nums.length-1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if(nums[pivot] == target){
            return  pivot;
        }

        if(target >= nums[0]) {
            return binarysearch(nums, target, 0, pivot - 1);
        }
        return binarysearch(nums,target,pivot+1,nums.length-1);
    }

    static int binarysearch(int[] arr, int target,int start , int end){
        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return  mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else {
                start = mid +1;
            }
        }

        return -1;
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid ;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            if(arr[mid] == arr[start] || arr[mid] == arr[end]) {
                // skip the duplicate

                // check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                 // check if start is pivot
                 if(arr[end] < arr[end-1]){
                    return end-1;
                 }
                end--;
            }

            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
