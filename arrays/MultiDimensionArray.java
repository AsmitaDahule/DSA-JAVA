import java.util.Scanner;
import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = new int[3][];

        // int[][] arr = {
        // {2,5,7}, //0th index
        // {5,7}, // 1st index
        // {9,3,7,5} //2nd index
        // };

        int[][] arr = new int[3][3];
        // System.out.println(arr.length); // no of rows
        // input

        for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // output
        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // for (int row = 0; row < arr.length; row++) {
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
