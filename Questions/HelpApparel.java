// Wipro Interview Question
//company have various plots in various shapes in differnt locations but they want only square shape plot
// and it must be biggest plot
//you have to choose perfect square number  from a unsorted array and return a maximum area plot (actual size)

public class HelpApparel {
    public static void main(String[] args) {
        int[] arr = {79, 77, 54, 81, 48, 34, 25, 16};
        int ans = findArea(arr);
        System.out.println(ans);
    }
    static int findArea(int[] arr) {
        int max = 0;
        int count =0;
        for(int num : arr) {
            if(isSquare(num)) {
                count++;
                // check for maximum
                if(num > max) {
                    max = num;
                }
            }
        }
        return max;
    }
    static boolean isSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        if(num == sqrt*sqrt) {
            return  true;
        }
        return false;
    }
}
