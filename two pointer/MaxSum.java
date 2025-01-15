public class MaxSum {
    public static void main(String[] args) {
        int arr[] = {6,2,3,4,7,2,1,7,1};
        int k = 4;
        int ans = findMaxSum(arr, k);
        System.out.println(ans);
    }
    public static int findMaxSum(int[] arr, int k){
        int maxSum = 0;
        int lsum = 0;
        int rsum = 0;

        for(int i = 0; i < k; i++){
            lsum += arr[i];
        } 

        maxSum = lsum;
        int rindex = arr.length-1;
        for(int i = k-1; i >=0; i--){
            lsum -= arr[i];
            rsum += arr[rindex];
            rindex--;

            maxSum = Math.max(maxSum, lsum+rsum);
        }
        return maxSum;
    }
    
}