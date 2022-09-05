package Stack;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Postfix expressions is: "+getPostFixExp(s));
    }

    private static String getPostFixExp(String s) {
        Stack<Character> stack = new Stack<>();
        String result = "";
        for(int i=0;i<s.length();++i){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                result += c;
            }else if(c == '('){
                stack.push(c);
            } else if (c == ')')
            {
                while (!stack.isEmpty() &&
                        stack.peek() != '(')
                    result += stack.pop();

                stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty() && getPrecedence(c)
                        <= getPrecedence(stack.peek())){

                    result += stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()){
           if(stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;
    }
    private static int getPrecedence(Character c){
        switch (c){
            case '+' :
            case '-' :
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}
