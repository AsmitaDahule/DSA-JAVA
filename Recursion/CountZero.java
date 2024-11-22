public class CountZero {
    public static void main(String[] args) {
        int n = 13050040;
        System.out.println(countZero(n));
    }
    static int count = 0;
    public static int countZero(int n){
        if(n == 0)
        return 0;

        int rem = n % 10;
        if(rem == 0){
            count++;
        }
        countZero(n/10);

        return count;
    }
    
}
