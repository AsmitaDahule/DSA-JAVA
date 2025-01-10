class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 4;

        int low = 0;
        int high = arr.length-1;
        int res = bs(arr, low, high, target);
        System.out.println(res);

        
    }
    public static int bs(int[] arr, int low, int high,int target){
        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] == target) return mid;

            else if(arr[mid] > target) high = mid - 1;

            else low = mid + 1;
        }

        return -1;
    }
}