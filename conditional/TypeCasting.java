import java.util.Scanner;
public class TypeCasting{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);
        int num1 = input.nextInt();
        // int num2 = input.nextFloat();

        //typecasting
        int n = (int)45.54f;
        System.out.println(n);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)a;  //257 % 256 =1
        System.out.println(b);


        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = c * d / e;
        System.out.println(f);
    }
}