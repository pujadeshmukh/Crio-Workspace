package String;

public class ValidAnagram {
    public static void main(String[] args) {
        String string1 = "rat";
        String string2 = "cat";
        if(isAnagram(string1,string2)==true){
            System.out.println("The strings are anagrams");
        }else{
            System.out.println("Strings are not anagram");
        }
    }

    private static boolean isAnagram(String string1, String string2) {
        if(string1.length() != string2.length()){
            return false;
        }
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        for(int i=0;i<string1.length();i++){
            char c = string1.charAt(i);
            array1[c-97]++;
            char d = string2.charAt(i);
            array2[d-97]++;
        }
        for(int i=0;i<array1.length;i++){
            if(array1[i] != array2[i]){
                return false;
            }
        }
        return true;
    }
}
