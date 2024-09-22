public class MovingZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        movingZeros(arr);
        for(int nums: arr) {
            System.out.print(nums + " ");
        }
    }

    static void movingZeros(int[] arr) {
        int nonZeroIndex = 0;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] != 0){
                arr[nonZeroIndex++]= arr[i];
            }
        }
        while(nonZeroIndex < arr.length){
            arr[nonZeroIndex++] = 0;
        }

    }
}
