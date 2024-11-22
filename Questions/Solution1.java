//1684: https://leetcode.com/problems/count-the-number-of-consistent-strings/description/

import java.util.HashSet;

class Solution1{
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        countConsistentStrings(allowed, words);
        System.out.println(ans);
    }
    class Solution {
        public int countConsistentStrings(String allowed, String[] words) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < allowed.length(); i++) {
                set.add(allowed.charAt(i));
            }
    
            int count = words.length;
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words[i].length(); j++) {
                    if (!set.contains(words[i].charAt(j))) {// Checks the Character do exist or Not
                        count--;
                        break;// Return from the secound loop and continue the first loop
                    }
                }
            }
            return count;
        }
    }
}