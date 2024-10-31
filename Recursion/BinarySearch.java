public class BinarySearch {
  public static void main(String[] args) {
    int arr[] = { 12, 15, 16, 25, 29, 30, 50 };
    int target = 3;
    int low = 0;
    int high = arr.length - 1;
    System.out.println(binarySearch(arr, target, low, high));
  }

  public static int binarySearch(int[] arr, int target, int low, int high) {
    while (low < high) {
      int mid = (low + high) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] > target) {
        return binarySearch(arr, target, low, mid - 1);
      } else {
        return binarySearch(arr, target, mid + 1, high);
      }
    }
    return -1;
  }
}
