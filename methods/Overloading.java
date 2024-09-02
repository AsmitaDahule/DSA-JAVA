public class Overloading {
    // number of argument must be different or type of argument must be different
    public static void main(String[] args) {
        fun(21);
        fun("Asmita Dahule");
        
        int ans = sum(4,9);
        System.out.println(ans);

        int ans2 = sum(43,4,3);
        System.out.println(ans2);
    }

    static int sum(int x, int y){
        return x +y ;
    }

    static int sum(int x, int y, int c){
        return x + y + c;
    }

    static void fun(int a) {
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
