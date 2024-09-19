public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {1,3,4,7,7,5,2};
        int ans = secondsmallest(arr);
        System.out.println(ans);
    }
    static int secondsmallest(int[] arr) {
        int smallest = arr[0];
        int sSmallest =  Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++) {
            if(arr[i] < smallest) {
                sSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] != smallest && arr[i] < sSmallest) {
                sSmallest = arr[i];
            }
        }
        return sSmallest;
    }
}
