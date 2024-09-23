import java.util.HashSet;

    class UnionOfArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 0, 5, 8, 4};
        int[] arr2 = {4, 3, 9, 7, 8, 10};
        int[] unionArray = getUnionArray(arr1, arr2);
        for (int num : unionArray) {
            System.out.print(num + " ");
        }
    }

    static int[] getUnionArray(int[] arr1, int[] arr2) {
        HashSet<Integer> result = new HashSet<>();
        for (int num : arr1) {
            result.add(num);
        }
        for (int num : arr2) {
            result.add(num);
        }

        // Convert HashSet to array
        int[] union = new int[result.size()];
        int index = 0;
        for (int num : result) {
            union[index++] = num;
        }
        return union;
    }
}

