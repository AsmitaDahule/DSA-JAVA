public class Main{
    public static void main(String[] args) {

        // create array
      int[] arr = {554,21,4,35,7,96};

      // target value
      int target = 96;
      
      // call linear search function
      int ans= linearSearch(arr, target);

      // print the result
      System.out.println(ans);
    }

    // search a target element in an array 
    static int linearSearch (int[] arr,int target) {
        // if length is zero
        if(arr.length==0){
            return -1;
        }
        // for loop for iterate the array
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
    
}