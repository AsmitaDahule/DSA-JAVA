class Armstrong {
    public static void main(String[] args) {
        int num = 154;
        int ans = findArmstrong(num);
        if(ans == num){
            System.out.println("Armstrong");
        }   else{
            System.out.println("Not a Palinddrome");
        }
    }
    static int findArmstrong(int num) {
        int sum = 0;
        while(num > 0) {
            int rem = num % 10;
            sum = sum + rem * rem * rem;
            num /= 10;
        }
        return sum;
    }
}