public class Palindrome {
    public static void main(String[] args) {
        int n = 124321;
        System.out.println(isPalindrome(n));
    }
    static int rev = 0;
    public static boolean isPalindrome(int n){
        if(n == 0)
        return true;

        rev = rev * 10 + n % 10;
        isPalindrome(n/10);

        if(n == rev)
        return true;

        return false;
    }
}
