import java.util.*;

public class BalancedBrackets {
    static String check(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') st.push(c);
            else if (c == ')') {
                if (st.isEmpty() || st.pop() != '(') return "NO";
            } else if (c == '}') {
                if (st.isEmpty() || st.pop() != '{') return "NO";
            } else if (c == ']') {
                if (st.isEmpty() || st.pop() != '[') return "NO";
            }
        }
        return st.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            System.out.println(check(s));
        }
    }
}