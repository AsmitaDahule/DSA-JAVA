import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
      int[] arr = {1,2,4,7,7,5};
      int ans = sLarge(arr);
      System.out.println(ans);
    }
    static int sLarge(int[] arr) {
        if(arr.length == 0) {
            return -1;
        }
        int large = arr[0];
        int secondLarge =Integer.MIN_VALUE;

        for(int i= 0; i< arr.length;i++) {
            if(arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            } else if(arr[i] < large && arr[i] > secondLarge) {
                secondLarge = arr[i];
            }
        }

        return secondLarge;
    }
}

