import java.util.*;

public class Greatest {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 5, 1, 9 };
        int max = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
    
            if (arr[i] > arr[i + 1]) {
                max = arr[i];
            }
            }
            
        System.out.println(max);

    }
}
