package String;
import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;
public class PrintDuplicatesInString {
    public static void main(String[] args) {
        String input = "test string";
        getDuplicate(input);
    }

    private static void getDuplicate(String input) {
       List<Character> ans = new ArrayList<>();
       Map<Character, Integer> map = new HashMap<>();
       for(int i=0;i<input.length();i++){
           char c = input.charAt(i);
           map.put(c,map.getOrDefault(c,0)+1);
       }
       for (Entry<Character, Integer> entry : map.entrySet()) {
               Character c = entry.getKey();
               int value = entry.getValue();
               if (value > 1) {
                   System.out.println(c + " " + value);
               }
       }
    }
}
