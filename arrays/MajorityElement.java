import java.util.*;
public class MajorityElement {

  public static List<Integer> majorityEle(int[] arr) {
    List<Integer> ans = new ArrayList<>();
    int n = arr.length;
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int num: arr) {
      map.put(num, map.getOrDefault(num,0)+1);
    }

    for(Map.Entry<Integer, Integer> set : map.entrySet()) {
      if(set.getValue() > n / 2) ans.add(set.getKey());
    }
    return ans;
  }
  public static void main(String[] args) {
    int[] arr = {3,2,3,2,2,3};
   System.out.println( majorityEle(arr));
    
  }
}
