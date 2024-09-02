import java.util.Scanner;

public class Occurance {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = 1241621;

    System.out.println("Enter digit you want to search");
    int occur =sc.nextInt();

    int i=0;
    int count =0;
    int temp=number;
    while(number !=0) {

        int rem = number % 10;
        number=number / 10;

        if(rem == occur) {
            count++;
        }
        i++;
    }
        System.out.println(occur + " occurs " + count + " times in a number " + temp);
   }
}
