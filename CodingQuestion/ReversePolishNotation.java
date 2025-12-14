package CodingQuestion;

import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args) {
        String[] a = new String[]{"2", "3", "+", "3", "*"};
        String[] b = new String[]{ "*"};
        reversePolish(b);
    }

    public static void reversePolish(String[] values) {
        int len = values.length;
        String operators = "+-/*";
        Stack<String> stack = new Stack<>();

        for (String t : values) {
            if (!operators.contains(t)) {
                stack.push(t);
            } else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                switch (t) {
                    case "+":
                        stack.push(String.valueOf(a + b));
                        break;
                    case "-":
                        stack.push(String.valueOf(b - a));
                        break;
                    case "*":
                        stack.push(String.valueOf(a * b));
                        break;
                    case "/":
                        stack.push(String.valueOf(b / a));
                        break;
                }
            }


        }
        System.out.println(stack.pop());
    }
}
