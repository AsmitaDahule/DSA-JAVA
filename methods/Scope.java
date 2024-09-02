public class Scope {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        System.out.println(a);

        // System.out.println(num); //out of scope
        // System.out.println(n);
    }   

    static void random(int n) {
        int x=n;
        x=687; // can change value again after initialized
        int num=23;
        System.out.println(num);

        // System.out.println(a); // out of scope

        {
            // int x =989;  cannot initialized again
            x=78; // can be modified
           int m=25;
           System.out.println(m);

        }

        // System.out.println(m);  block scope
        int m=7;
        System.out.println(m);
        
        System.out.println(x);
    }

    static void swap(int num1, int num2) {
        // function scope
        int temp =num1;
        num1 = num2;
        num2 = temp;

        //this change will onjly be valid in this function scope only.
    }

    static void loop(){
    for(int i=0;i<5;i++) {
        System.out.println(i);
    }
    // System.out.println(i); // out of scope
    }

}
