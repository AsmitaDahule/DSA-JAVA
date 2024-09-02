import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
            System.out.println(b);

        }

    }

}
