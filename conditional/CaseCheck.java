import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0); 
        //.trim() --> remove all extra spaces

        if(ch > 'a' && ch <'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }

        // System.out.println(ch);

        // System.out.println(sc.next());
        // System.out.println(sc.next().trim());

        // String word ="Asmii";
        // System.out.println(word.charAt(1));

        

        
    }
}
