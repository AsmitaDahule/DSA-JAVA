public class EvenDigit {
    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896 };
        int ans = findNumbers(arr);
        System.out.println(ans);
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num = 0; num < nums.length; num++) {
            if (even(num)) {
                count++;
            }
        }
        return count;

    }

    static boolean even(int num) {
        int noofdigit = digits(num);
        return noofdigit % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return -1;
        }
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}
