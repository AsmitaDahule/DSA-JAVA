import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        // list.add(1);
        // list.add(54);
        // list.add(7);
        // list.add(8);
        // list.add(45);
        // list.add(451);
        // list.add(41);

        // System.out.println(list);

        // System.out.println(list.contains(14));
        // System.out.println(list.contains(54));

        // list.set(0,99);
        // System.out.println("Updated arraylist");
        // System.out.println(list);

        // list.remove(2);
        // System.out.println(list);


        //input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list);

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //pass index here, list[index] syntax will not work here
        }

        System.out.println(list);

        

    }
}
