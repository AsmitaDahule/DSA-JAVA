public class Factorial {
    public static void main(String[] args) {
        int n=5;
        int ans =factorial(n);
        System.out.println(ans);
    }
    public static int factorial(int n)
    {
        if(n == 0 || n == 1)
        return 1;

        int fact = factorial(n-1);
        int fact_n= n * fact;
        return fact_n;
    }
}
