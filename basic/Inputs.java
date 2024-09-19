import java.util.Scanner;

public class Inputs {
public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter roll number");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);
        int money = 6_00_000;
        System.out.println(money);

        String name = input.next();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);

        boolean isHappy = input.nextBoolean();
        System.out.println(isHappy);

        

        //why below part is not running i don't know
        String fullname = input.nextLine();
        System.out.println(fullname);
        

    }
}
