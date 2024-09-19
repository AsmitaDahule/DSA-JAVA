class Smallest {
    public static void main(String[] args) {
        int [] arr = {1,2,41,45,45,-3};
        int ans = smallElement(arr);
        System.out.println(ans);
    }
    static int smallElement(int[] arr) {
        if(arr.length == 0) {
            return -1;
        }
        int small = arr[0];

        for(int i= 0; i< arr.length;i++) {
            if(arr[i] < small) {
                small = arr[i];
            }
        }

        return small;
    }
}