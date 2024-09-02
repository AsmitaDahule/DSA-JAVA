public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = {-25,-12,1 ,54 ,87, 99,121,541};
        int[] arr = { 99,88,77,54,44,24,11,3,-5,-69};
        int target = -69;
        int ans = orderagnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderagnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find array is in ascending order or descending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }
}