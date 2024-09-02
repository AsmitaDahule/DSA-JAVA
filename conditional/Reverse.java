import java.util.Scanner;

public class Reverse {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int number = sc.nextInt();

    int i=0;
    int reverse = 0;
    int temp = number;
    while(number != 0) {
        int digit=number%10;
        number =number/10;
        reverse = (reverse *10) + digit;
        
        i++;
    }
    System.out.println("Reverse of " + temp + " is " + reverse);
    
   }
}
