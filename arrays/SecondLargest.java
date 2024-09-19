public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
       System.out.println(secondLarge(arr));
    }
    static int secondLarge(int[] arr) {
        int largest = arr[0];
        int slargest = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }   
        return slargest;
    }
}
