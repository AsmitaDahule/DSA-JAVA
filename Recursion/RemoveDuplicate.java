import java.util.*;
public class RemoveDuplicate {
  public static StringBuilder removeDuplicate(String str, boolean[] arr, StringBuilder ans, int i) {
    // base condition
    if(i == str.length()) return ans;

    char ch = str.charAt(i);
    int index = ch - 'a';
    if(arr[index] == false) {
      arr[index] = true;
      return removeDuplicate(str, arr, ans.append(ch), i+1);
    }
    return removeDuplicate(str, arr, ans, i+1);
  }
  public static void main(String[] args) {
    String str = new String("appnancollege");
    boolean arr[] = new boolean[26];
    Arrays.fill(arr,false);
    System.out.println(removeDuplicate(str, arr, new StringBuilder(""), 0));

  }
}
