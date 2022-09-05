package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>>  ans = groupAnagrams(str);
        for (List<String> list : ans){
            System.out.println(list);
        }
    }

    private static List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> ans = new ArrayList<>();
        if(str.length == 0){
            return ans;
        }
        Map<Map<Character,Integer>,List<String>> bigMap = new HashMap<>();

        for(String s : str){
            Map<Character,Integer> freqMap = new HashMap<>();

            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                freqMap.put(c,freqMap.getOrDefault(c,0)+1);
            }
            System.out.println("hashcode "+freqMap.hashCode());
            if(!bigMap.containsKey(freqMap)){
                List<String> list = new ArrayList<>();
                list.add(s);
                bigMap.put(freqMap,list);
            }else{
                List<String> list = bigMap.get(freqMap);
                list.add(s);
            }
        }

       for(Map.Entry<Map<Character,Integer>,List<String>> entry : bigMap.entrySet()){
            List<String> temp = entry.getValue();
            ans.add(temp);
       }
        return ans;
    }
}
