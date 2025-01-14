class Sum {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 3, 4, 5, -1};
        int k = 4;

        int ans = findSum(arr,k);
        System.out.println("Maximum Sum : " + ans);
    }

    public static int findSum(int[] arr, int k){
        int left = 0;
        int right = k-1;
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum+= arr[i];
        }
        maxSum = sum;
        while(right < arr.length-1){
            sum = sum - arr[left];
            left++;
            right++;
            sum = sum + arr[right];

            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}