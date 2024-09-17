import java.util.Arrays;

public class BSearch2D {
    public static void main(String[] args) {
        int[][] arr = {
            {10,15,25,35},
            {11,17,30,40},
            {15,24,35,50},
            {20,30,37,52}
        };
        int target =10;

        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] matrix,int target) {

        int r = 0;
        int c = matrix.length-1;

        while ( r <= matrix.length-1 && c >= 0) {
            if(matrix[r][c] == target){
                return new int[] {r,c};
            }
            if(matrix[r][c] < target){
                r++;
            } else {
                c--;
            }

    }
    return new int[] {-1,-1};
}

}

