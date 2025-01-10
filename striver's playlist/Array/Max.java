import java.util.Arrays;

class Max {
    public static void main(String[] args) {
        int arr[] = {2,4,12,90,5,7,99,14,143,88};
        int ans = largest(arr);
        System.out.println(ans);
        int ans2 = largest1(arr);
        System.out.println(ans2);
        int ans3 = largest2(arr);
        System.out.println(ans3);
    }
    public static int largest(int[] arr) {
        // code here
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int largest1(int[] arr) {
        // code here
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }

    public static int largest2(int[] arr) {
    return Arrays.stream(arr).max().getAsInt();
}

}
