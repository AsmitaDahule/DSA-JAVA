
class QuickSort {

    public static void main(String[] args) {
        int[] arr = { 2, 1,0,7,45,5};
        quickSort(arr, 0, arr.length - 1);
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        // code here
        if (low < high) {
            int Pindex = partition(arr, low, high);
            quickSort(arr, low, Pindex - 1);
            quickSort(arr, Pindex + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        // your code here
        int i = low;
        int j = high;
        int pivot = arr[low];

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;

        return j;
    }
}
