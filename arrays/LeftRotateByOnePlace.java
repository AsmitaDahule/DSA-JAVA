// import java.util.Arrays;

public class LeftRotateByOnePlace {
   public static void main(String[] args) {
    int[] arr = {2,3,4,6,8,7};
    // System.out.println(Arrays.toString(arr));
    RotateByOne(arr);
    printArray(arr);

   } 
   static int[] RotateByOne(int[] arr) {
    int temp = arr[0];

    for(int i = 1; i< arr.length; i++) {
        arr[i-1] = arr[i];
    }
    arr[arr.length-1] = temp;
    
    return arr;
   }

   static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
       System.out.print(arr[i] + " ");
    }
    System.out.println(); // New line after printing
 }
}
