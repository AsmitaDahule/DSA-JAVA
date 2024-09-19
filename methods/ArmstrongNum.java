public class ArmstrongNum {
    public static void main(String[] args) {
        int number = 371;
        boolean ans = isArmstrong(number);
        System.out.println(ans);
        
    }
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while(n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n /= 10;
        }   
        if(original == sum) {
            return true;
        }   
        return false;
    }
}
