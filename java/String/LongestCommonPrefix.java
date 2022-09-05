package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        System.out.println("The longest common prefix is: "+getPrefix(arr));
    }

    private static String getPrefix(String[] arr) {
        if(arr.length == 0){
            return null;
        }
        String base = arr[0];
        for(int i=1;i<arr.length;i++){
            String compareWord = arr[i];
            int j=0;
            while(j<compareWord.length() && j<base.length() && compareWord.charAt(j)==base.charAt(j)){
                j++;
            }
            if(j==0){
                return "";
            }
            base = compareWord.substring(0,j);
        }
        return base;
    }
}
