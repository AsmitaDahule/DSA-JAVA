import java.util.*;
class ChocolateFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Chocolate Pocketes !");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the number of chocolates in each pocletes..");
        for(int i=0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        chocolateFactory(n, arr);
    }

    public static void chocolateFactory(int n, int arr[]) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < n) {
            arr[count] = 0;
            count++;
        }

        for(int num: arr) {
            System.out.print(num + " ");
        }
    }
}