public class Reverse {
    public static void main(String[] args) {
        int ans = reverse(1234);
        System.out.println(ans);
        
    }
    static int rev = 0;
    public static int reverse(int n){
        if(n == 0)
        return 0;

        rev = rev * 10 + (n % 10);
        reverse(n/10);

        return rev;
    }
}
