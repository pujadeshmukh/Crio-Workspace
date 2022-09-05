package String;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println("The length of longest substring with unique characters is:"+getUniqueCharSubArrayLen(s));
    }

    private static int getUniqueCharSubArrayLen(String s) {
        if(s.length() == 1){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLen = 0;
        while(left < s.length() && right<s.length()){
            char c = s.charAt(right);
            if(!set.contains(c) ){
                set.add(c);
                right++;
                maxLen = Math.max(maxLen,set.size());
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
}
