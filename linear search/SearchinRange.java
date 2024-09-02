public class SearchinRange {
    public static void main(String[] args) {
        // create array
        int[] arr = {16, 12, -7, 3, 14, 28};
        int target = 4545;
        int ans = search(arr, 1, 4, target);
        System.out.println(ans);
        
    }

    // search in range function
    static int search(int[] arr, int start, int end, int target){
        // base condition
        if(arr.length == 0){
            return -1;
        }

        // iterate a array in range
        for(int index = start; index <= end ; index++){
            if(arr[index]==target){
                return index;
            }
        }

        return -1;
    }
}
