public class Swap1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a,b);
        System.out.println(a + " " + b);
    }

    // given swap method cannot swap the values of a and b
    static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
