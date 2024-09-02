import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //Que: take input of 2 numbers and print the sum
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter first number");
        int num1 =sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("sum is :" + sum);
        
    }
}