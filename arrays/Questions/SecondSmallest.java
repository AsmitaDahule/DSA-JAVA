public class SecondSmallest {
    public static void main(String[] args) {
      int[] arr = {11,2,4,7,7,5};
      int ans = sSmall(arr);
      System.out.println(ans);
    }
    static int sSmall(int[] arr) {
        if(arr.length == 0) {
            return -1;
        }
        int small = arr[0];
        int secondSmall =Integer.MAX_VALUE;

        for(int i= 1; i< arr.length;i++) {
            if(arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            } else if(arr[i] != small && arr[i] < secondSmall) {
                secondSmall = arr[i];
            }
        }

        return secondSmall;
    }
}


