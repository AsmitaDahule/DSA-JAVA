class DoubleTheSize {
    public static void main(String[] args) {
        int sum = 1;
        for(int i = 1; i < 31; i++){
            sum =2 * sum;
        }
        if(sum < 70000000) {
            System.out.println("I'll chose 7Cr once");
        }else {
            System.out.println("I'll chose 2 Rs which double for next 30 days,\nafter 30 days total money will be " + sum);
        }
    }
}