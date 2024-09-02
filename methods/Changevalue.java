import java.util.Arrays;
public class Changevalue{
    public static void main(String[] args) {
        // create an array
        int[] array ={78,5,2, 84};
        change(array);
        System.out.println(Arrays.toString(array));
        
    }
    static void change(int[] arr) {
        arr[0] = 99; // changes reflect in original array also
    }
}