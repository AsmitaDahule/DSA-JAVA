import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        int s = sum2();
        System.out.println("sun is " + s);
        int s3 =sum3(21,45);
        System.out.println("Sum is " + s3);
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 =sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("sum is :" + sum);
     }

     static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 =sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        return sum;
     }

     static int sum3(int a, int b){
        int sum = a + b;
        return sum;
     }
}
