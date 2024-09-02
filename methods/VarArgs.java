import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(); // it may be empty also
        fun(43, 54, 94, 32, 2, 54);

        multiple(43,3); // c is null by default
        multiple(98,88,"asmi","titu","soham","sammi"); //orde is important

    // demo();  //ambiguity
    }

    static void demo(int a, String ...m){
        System.out.println(Arrays.toString(m));
    }

    static void demo(String m, int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...c) {
        System.out.println(Arrays.toString(c));
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
