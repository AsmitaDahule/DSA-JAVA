import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,32},
            {54,8,98,3},
            {21,5,45}
        };
        int target=465;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    // search element in 2D array
    static int[] search(int[][] arr, int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        // loop for iterate a array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        
        return new int[]{-1,-1};
    }
}
