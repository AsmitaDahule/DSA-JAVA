public class Sum {
   public static void main(String[] args) {
      int n = 5;
      System.out.println(findSum(n));
   } 

   public static int findSum(int num){
      if(num == 0)
         return 0;
      return num + findSum(num-1);
   }
}
