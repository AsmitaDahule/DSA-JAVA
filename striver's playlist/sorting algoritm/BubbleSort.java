import java.util.Scanner;

// if the array is sorted then time compelxity will be O(n) 
// worst case time complexity : O(n^2)

public class BubbleSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for(int e : arr){
            System.out.print(e + " ");
        }
    } 
    public static void sort(int[] arr){
        int n = arr.length-1;
        for(int i = 0; i < n; i++){
            int didswap = 0;
            for(int j = 0; j < n - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            } 
            if(didswap == 0) break;
            System.out.println("run");
        }

    }
}