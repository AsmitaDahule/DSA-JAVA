class CountRotetion {
    public static void main(String[] args) {
        int[] arr = {14,14,14,0,1,2,8,10};
        System.out.println(countRotetions(arr));
    }

    static int countRotetions(int[] arr){
        int pivot = findPivot(arr);
        return pivot+1;
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
            if(arr[mid] >= arr[start]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
