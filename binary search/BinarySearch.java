public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-55,-1,24,44,57,69,88,96,121};
        int target = -55;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr, int target){
       int start = 0;
       int end = arr.length-1;
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
}
