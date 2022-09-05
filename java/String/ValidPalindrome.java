package String;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "AmanaplanacanalPanama";
        if(isPalindrom(s) == true){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }

    private static boolean isPalindrom(String s) {
        int start = 0;
        int end = s.length()-1;
        int middle = start + (end - start)/2;
        while (start <=middle && end >=middle){
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}
