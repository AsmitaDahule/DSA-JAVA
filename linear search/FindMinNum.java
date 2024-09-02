public class FindMinNum {
   public static void main(String[] args) {
    int[] arr={456,65,78,1,2,48,3,26,-899,-1,45,46546,56};
    int ans = min(arr);
    System.out.println(ans);
   }
   
   // minimum number function
   static int min(int[] arr){
      if(arr.length==0){
         return -1;
      }
      
      // for loop
      int min=arr[0];
      for(int i = 0; i<arr.length;i++){
         if(arr[i] < min){
            min=arr[i];
         }
      }

      return min;
   }
   
}
