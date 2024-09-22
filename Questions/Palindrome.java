class Palindrome{
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }
static  public boolean isPalindrome(int x) {
    if(x < 0){
        return false;
    }
        int temp = x;
        int reverse = 0;
        while(x > 0){
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        if(reverse == temp){
            return true;
        }

        return false;
    }
}