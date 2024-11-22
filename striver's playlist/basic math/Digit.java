class Digit{
    public static void main(String[] args) {
        int num = 7789;
        while(num > 0){
            int lastdigit = num % 10;
            System.out.println(lastdigit);
            num = num / 10;
        } 
    }
}