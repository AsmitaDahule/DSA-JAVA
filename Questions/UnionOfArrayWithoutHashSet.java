import java.util.Arrays;

public class UnionOfArrayWithoutHashSet {
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 0, 7, 11, 4, 5, 8, 4};
        int[] arr2 = {4, 3, 9, 8, 7, 8, 10};
        int[] unionArray = getUnionArray(arr1, arr2);
        System.out.println(Arrays.toString(unionArray));
    }

    static int[] getUnionArray(int[] arr1, int[] arr2) {
        int[] tempUnion = new int[arr1.length + arr2.length];
        int index = 0;

        // Add elements from the first array
        for (int num : arr1) {
            if (!contains(tempUnion, num, index)) {
                tempUnion[index++] = num;
            }
        }

        // Add elements from the second array
        for (int num : arr2) {
            if (!contains(tempUnion, num, index)) {
                tempUnion[index++] = num;
            }
        }

        // Create the final union array
        return Arrays.copyOf(tempUnion, index);
    }

    static boolean contains(int[] array, int value, int length) {
        for (int i = 0; i < length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
