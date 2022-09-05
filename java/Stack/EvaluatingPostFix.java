package Stack;

import java.util.Stack;

public class EvaluatingPostFix {
    public static void main(String[] args) {
        String s = "231*+9-";
        System.out.println("Postfix evaluation is: " + getPostFix(s));
    }

    private static int getPostFix(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int second = stack.pop();
                int first = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(first + second);
                        break;
                    case '-':
                        stack.push(first - second);
                        break;
                    case '*':
                        stack.push(first * second);
                        break;
                    case '/':
                        stack.push(first / second);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
