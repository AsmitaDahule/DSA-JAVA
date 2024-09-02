import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // find the largest of the tree numbers

        // int max = a;
        // if (b > max) {
        //     max = b;
        // }
        // if (c > max) {
        //     max = c;
        // }
        // System.out.println(max + " is maximum");


        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);

    }
}
