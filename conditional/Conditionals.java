import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        // print numbers from 1 to 5

        // System.out.println(1);
        // System.out.println(2);
        // System.out.println(3);
        // System.out.println(4);
        // System.out.println(5);

        /*
         * syntax of for loop
         * 
         * for (initialization ; condition; increment/decrement) {
         * // body
         * }
         */

        // for (int num = 1; num <= 5; num += 1) {
        //     System.out.println(num);
        // }

        // // print number from 1 to n
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int n = input.nextInt();

        // for (int num = 1; num <= n; num += 1) {
        //     System.out.println(num);
        //     System.out.println("Hare Krishna");
        // }




        /*
            // while loop 
            syntax:

            while (condition) {
              // body
              }

         */

        //  int num =1;
        //  while(num < 5) {
        //     System.out.println(num);
        //     num +=1;
        //  }





         /*
            // do-while loop
            syntax:
            do{
                //body
            } while(condition);
          */

          int num = 1;
          do{
            System.out.println(num);
            num ++;
          }while(num < 6);

    }
}
