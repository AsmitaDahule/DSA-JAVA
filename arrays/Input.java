import java.util.Scanner;
import java.util.Arrays;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //array of primititve
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 5; 
        arr[2] = 54;
        arr[3] = 43;
        arr[4] = 9;

        // System.out.println(arr[3]);
        // // System.out.println(arr[5]); // ArrayIndexOutOfBound

        // // using for loop
        // int[] array = new int[5];
        // for (int i = 0; i < array.length; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // // printing using for loop
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // System.out.println();

        // // printing using for-each loop
        // for(int num : arr){
        //     System.out.print(num + " "); //num represnt element of an array
        // }

        // System.out.println();

        // System.out.println(Arrays.toString(arr));

        
        // array of objects
        String[] a = new String[4];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.next();
        }

        // printing using toString
        System.out.println(Arrays.toString(a));

        // modify
        a[2] = "asmi"; // change in original array also
        
        System.out.println(Arrays.toString(a));

    }
}
