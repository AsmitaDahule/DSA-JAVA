public class ColnoFixed {
    public static void main(String[] args) {
        int[][] arr = {
            {2,5,9},
            {9,6},
            {5,8,7,2}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
