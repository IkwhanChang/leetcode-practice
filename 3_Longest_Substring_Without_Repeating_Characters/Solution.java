public class Solution {
    public int lengthOfLongestSubstring(String s) {
      int max = 0, curr_max = 0;
      int[] hashmap = new int[256];

      for(int k = 0 ; k < s.length() ; k++){
        for(int j = 'a' ; j <= 'z' ; j++)  hashmap[j] = 0;
        hashmap[s.charAt(k)] = curr_max = 1;
        for(int i = k + 1 ; i < s.length() ; i++) {
          if(hashmap[s.charAt(i)] != 0) {
            curr_max = 1;
            break;
          }
          hashmap[s.charAt(i)] = 1;
          curr_max++;
        }
        if(curr_max > max)  max = curr_max;
      }

      return max;
    }

    public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.lengthOfLongestSubstring("zwnigfunjwz"));
    }
}
