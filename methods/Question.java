import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c <= Math.sqrt(n)) {
            c++;
            if (n % c == 0) {
                return false;
            }
        }   
        return true;
    }
}
