class Convert10to2 {
    public static void main(String[] args) {
        System.out.println(convert(1010));
    }
    public static int convert(int binary) {
        int res = 0, power = 1;
        while(binary > 0) {
            int lastdigit = binary % 10;
            res += lastdigit * power;
            power *= 2;
            binary /= 10;
        }
        return res;
    }
}