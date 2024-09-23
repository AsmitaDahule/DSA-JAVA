import java.util.Arrays;

public class IntersectionArray {
    public static void main(String[] args) {
        int[] arr1 = {21, 48,  32, 48, 54, 87}; // Sorted array
        int[] arr2 = {0, 1, 4, 48, 48, 55, 87, 88, 231}; // Sorted array
        
        int[] intersectionArray = intersectionOfArray(arr1, arr2);
        System.out.println(Arrays.toString(intersectionArray));
    }

    static int[] intersectionOfArray(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int[] tempIntersection = new int[Math.min(arr1.length, arr2.length)]; // Temp array for intersection
        int index = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else { // They are equal
                tempIntersection[index++] = arr1[i];
                i++;
                j++;
            }
        }

        return Arrays.copyOf(tempIntersection, index); // Return only the filled portion
    }
}
