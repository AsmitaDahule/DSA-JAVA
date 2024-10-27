public class Sum {
   public static void main(String[] args) {
    findSum(1,5,0);
   } 

   public static void findSum(int initial, int end, int sum){

    if(initial == end+1){
    // sum = sum + end;
    System.out.println(sum);
    return;
    }

    sum = sum + initial;
    findSum(initial+1, end, sum);
    System.out.println(initial); // print but in reverse manner
   }
}
