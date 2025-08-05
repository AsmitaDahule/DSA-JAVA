public class Factorial {
    public static void main(String[] args) {
        int n=5;  
    // 5 = 5*4*3*2*1 = }
        int ans =factorial(n);
        System.out.println(ans);
    }
    public static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        return fact;
    }
}