import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "({]}[)";
        Stack<Character> st = new Stack<>();

        boolean isValid = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty() ||
                    (ch == ')' && st.peek() != '(') ||
                    (ch == '}' && st.peek() != '{') ||
                    (ch == ']' && st.peek() != '[')) {
                    
                    isValid = false;
                    break;
                }
                st.pop();
            }
        }

        if (!st.isEmpty()) {
            isValid = false;
        }

        System.out.println(isValid ? "Valid" : "Invalid");
    }
}
