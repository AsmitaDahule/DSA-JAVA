import java.util.Arrays;

public class QuickSort {

  public static void quickSort(int[] arr, int si, int ei) {
    if(si >= ei) return;

    int pidx = partition(arr, si, ei);
    quickSort(arr, si, pidx-1);
    quickSort(arr, pidx+1, ei);
  }

  public static int partition(int[] arr, int si, int ei) {
    int pivot = arr[ei];
    int i = si-1;
    for(int j = si; j < ei; j++) {
      if(arr[j] < pivot) {
        i++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    } i++;
      int temp = arr[i];
      arr[i] = arr[ei];
      arr[ei] = temp;

    return i;
  }

  public static void main(String[] args) {
    int[] arr = {5,2,8,-7,9,1,3,6,4};
    int n = arr.length-1;
    quickSort(arr, 0, n);
    // System.out.println(arr);  // not print 
    System.out.println(Arrays.toString(arr));

  }
}
