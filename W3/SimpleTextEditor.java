import java.util.*;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        String s = "";
        Deque<String> st = new ArrayDeque<>();
        StringBuilder out = new StringBuilder();

        while (q-- > 0) {
            int t = sc.nextInt();
            if (t == 1) {
                st.push(s);
                s = s + sc.next();
            } else if (t == 2) {
                st.push(s);
                int k = sc.nextInt();
                s = s.substring(0, s.length() - k);
            } else if (t == 3) {
                int k = sc.nextInt();
                out.append(s.charAt(k - 1)).append('\n');
            } else s = st.isEmpty() ? "" : st.pop();
        }
        System.out.print(out.toString());
    }
}
