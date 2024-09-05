public class Armstrong {
    public static void main(String[] args) {
        int a = 153;
        System.out.println(isArmstrong(a));
    } static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        boolean ans = false;
        while(num > 0) {
            int rem = num % 10;
            int cube = rem * rem * rem;
            sum += rem;
            num /= 10;
        }
        if(sum == temp) {
            return true;
        }   
        else {
            return false;
        }
    }
}
