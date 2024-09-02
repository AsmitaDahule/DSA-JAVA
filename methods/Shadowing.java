public class Shadowing {
    static int x; // by default zero
    static int y=78; //this will be shadowed at line 9
    public static void main(String[] args) {
        System.out.println(x); //0
        System.out.println(y); //78
        int x; // the class variable at line 2 is shadowed by this
        x=54;
        System.out.println(x); //54

        int y=768;
        System.out.println(y); //768

        fun(); //0
    }

    static void fun()
    {
        System.out.println(x);
    }
}
