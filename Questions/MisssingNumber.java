class MissingNumber{
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int num = 5;
        System.out.println(missingNumber(arr, num));

    }



    static int missingNumber(int[] arr, int num){
        for(int i =0; i < num; i++){
            for(int j = 0; j < arr.length-1;j++){
                if(arr[j] == i){

                }
                else{
                    return i;
                }
            }
        }
        return -1;
    }
}