import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // greeting();
        // String g= greeting2();
        // System.out.println(g);

        System.out.println("Enter your name");
        String name= sc.next();
        String gr = greet3(name);
        System.out.println(gr);
    }
    static void greeting(){
        System.out.println("Hare Krishna Asmii");
    }

    static String greeting2()
    {   
        String greet = "Hare Krishna";
        return greet;
    }

    static String greet3(String name){
        String greet ="Hello " + name;
        return greet;
    }
    
}

/*

 return_type name (arguments) {
    // body
    return statement;
 }

 */