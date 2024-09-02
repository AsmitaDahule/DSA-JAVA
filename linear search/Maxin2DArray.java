import java.util.Arrays;

public class Maxin2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,32},
            {54,8,98,3},
            {21,5,45}
        };
        int ans = search(arr);
        System.out.println(ans);
    }

    // search element in 2D array
    static int search(int[][] arr){
        if(arr.length==0){
            return -1;
        }
        // loop for iterate a array
        int max = Integer.MIN_VALUE; // int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        
        return max;
    }
}
