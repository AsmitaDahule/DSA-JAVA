
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
class CountSteps {
    public static void main(String[] args) {
        int ans = numberOfSteps(123);
        System.out.println(ans);
    }
    public static int numberOfSteps(int num) {
        
        return helper(num,0);
        
    }
    public static int helper(int n, int count){
        if(n == 0){
            return count;
        }
        if(n % 2 == 0){
            return helper(n/2,count+1);
        }
        return helper(n-1,count+1);
    }
}
