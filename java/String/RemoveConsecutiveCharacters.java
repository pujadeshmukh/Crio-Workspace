package String;

import java.util.Stack;

public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        String s = "aabaa";
        System.out.println("String after removing consecutive characters is: "+getUniqueCharString(s));
    }

    private static String getUniqueCharString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!stack.isEmpty() && stack.peek() != s.charAt(i)){
                stack.push(s.charAt(i));
            }
        }

        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
