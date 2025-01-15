public class LongestSubArray {

    // Brute force
    // public static void main(String[] args) {
    //     int[] arr = {2,5,1,7,10};
    //     int k = 14;
    //     int maxlen = 0;
        

    //     for(int i = 0; i < arr.length-1; i++){
    //         int sum = 0;
    //         for(int j = i; j < arr.length-1; j++){
    //             sum += arr[j];

    //             if(sum <= k){
    //                 maxlen = Math.max(maxlen, j-i+1);
    //             }
    //         else if(sum > k) break;            }
    //     } System.out.println(maxlen);
    // }


    



    // better solution 
    // public static void main(String[] args) {
    //     int[] arr = {2,5,1,7,10};
    //     int k = 14;
    //     int left = 0;
    //     int right = 0;
    //     int sum = 0;
    //     int maxlen = 0;
        
    //     while(right < arr.length){
    //         sum += arr[right];

    //         while (sum > k) {
    //             sum -= arr[left];
    //             left++;
    //         }
    //         if(sum <= k){
    //             maxlen = Math.max(right-left+1, maxlen);
    //         }
    //         right++;
    //     }
    //      System.out.println(maxlen);
    // }






    // optimal solution
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,10};
        int k = 14;
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxlen = 0;
        
        while(right < arr.length){
            sum += arr[right];

            if(sum > k) {
                sum -= arr[left];
                left++;
            }
            maxlen = Math.max(right-left+1, maxlen);
            right++;
        }
         System.out.println(maxlen);
    }
}
