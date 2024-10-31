public class SumOfDigit {
    public static void main(String[] args) {
        int num = 153;
        System.out.println(findSum(num));
    }
    public static int findSum(int n){
        if(n == 0)
            return 0;

        int rem = n % 10;
        return rem + findSum(n/10);
        
    }
}
