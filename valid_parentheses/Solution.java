package valid_parentheses;


import java.util.Stack;

public class Solution {
    public static void main(String[] args) {

        String s = "(";
        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = ")[]{}(";

        System.out.println(isValid(s1));
    }

    public static boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[' ){
                stack.push(c);
            }else if (stack.isEmpty()){
                return false;
            }else{
                char last = stack.pop();
                if ((last == '(' && c == ')') || (last == '{' && c == '}') || (last == '[' && c == ']')){
                    return true;
                }
            }
        }
        return false;
    }
}
