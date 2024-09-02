import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Enter the array of size 10");
        Scanner sc = new Scanner(System.in);
        for (int nums : arr){
            arr[nums] = sc.nextInt();
        }
        System.out.println("Enter number you want to search");
        int target = sc.nextInt();

        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return  mid;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else {
                start = mid +1;
            }
        }

        return -1;
    }
}
