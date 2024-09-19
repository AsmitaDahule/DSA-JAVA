import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int[] arr = {4, 5, 51, 45};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
