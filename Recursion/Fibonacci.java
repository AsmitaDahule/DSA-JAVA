public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 5;
        System.out.println(a);
        System.out.println(b);
        findFibSeries(a, b, n-2);
    }
    public static void findFibSeries(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        findFibSeries(b, c, n-1);
    }
}
