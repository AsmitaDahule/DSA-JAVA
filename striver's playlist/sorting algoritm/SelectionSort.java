public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,1,8,7,0,3,5};
        sort(arr,arr.length);
        for(int i: arr){
            System.out.print(i + " ");
        }
    } public static void sort(int[] arr, int n){
        for(int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
