import java.util.Scanner;

class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int ans = largeElement(arr,n);
        System.out.println(ans);
    }
    static int largeElement(int[] arr, int n) {
        if(arr.length == 0) {
            return -1;
        }
        int large = arr[0];

        for(int i= 0; i< arr.length;i++) {
            if(arr[i] > large) {
                large = arr[i];
            }
        }

        return large;
    }
}