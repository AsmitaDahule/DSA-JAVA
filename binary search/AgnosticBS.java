class RotetedArray {
    public static void main(String[] args) {
        int[] arr = { 10, 14, 15, 20, 2, 4, 8, 9 };
        int target = 15;
        int ans = search(arr, target);
        System.out.println(ans);

    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int pivot = 0;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                 pivot = mid;
            } else {
                start = mid + 1;
            }
        }
        return bsearch(arr, target, pivot);

    }

    static int bsearch(int[] arr, int target, int pivot) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}