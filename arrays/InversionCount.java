import java.util.*;
public class InversionCount {

  public static int inversionCnt(int[] arr) {
    int cnt = 0;

    for(int i = 0; i < arr.length-1; i++) {
      for(int j = i+1; j < arr.length; j++) {
        if(arr[i] > arr[j]) cnt++;
      }
    }
    return cnt;
  }
  public static void main(String[] args) {
    int[] arr = {2,4,1,3,5};
   int cnt = inversionCnt(arr);
   System.out.println(cnt);
    
  }
}
