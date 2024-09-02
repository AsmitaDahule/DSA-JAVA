import java.util.Scanner;

public class SwitcCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter fruit name");
        // // Take only one word
        // String fruit =sc.next();
        // System.out.println(fruit);

        // //take a sentence
        // // String fruit = sc.nextLine();
        // // System.out.println(fruit);


        // switch (fruit) {
        //     // case "Apple":
        //     //     System.out.println("Red rounded shape fruit");
        //     //     break;
        //     // case "Mango":
        //     //     System.out.println("King of fruits");
        //     //     break;
        //     // case "Grapes":
        //     //     System.out.println("Small green color fruit");
        //     //     break;
        //     // case "Banana":
        //     //     System.out.println("long yellow color fruit");
        //     //     break;
        //     // default:
        //     //     System.out.println("Enter valid fruit name");

        //     case "Mango" -> System.out.println("King of fruit");
        //     case "Apple" -> System.out.println("Red color fruit");
        //     case "Orange" -> System.out.println("Orange color fruit");
        //     default -> System.out.println("Please enter valid fruit name");


            System.out.println("Enter day");
            int day =sc.nextInt();
            switch(day){
            // case 1:
            // case 2:
            // case 3:
            // case 4:
            // case 5:
            //     System.out.println("Working day");
            //     break;
            // case 6:
            // case 7:
            //     System.out.println("Weekend");

            case 1,2,3,4,5 -> System.out.println("Working day");
            case 6,7 -> System.out.println("Weekend");
             }
            }
}
