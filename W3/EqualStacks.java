import java.util.*;

public class EqualStacks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
        int[] a = new int[n1], b = new int[n2], c = new int[n3];
        for (int i = 0; i < n1; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++) b[i] = sc.nextInt();
        for (int i = 0; i < n3; i++) c[i] = sc.nextInt();
        Stack<Integer> s1 = new Stack<>(), s2 = new Stack<>(), s3 = new Stack<>();
        int sum = 0;
        s1.push(0);
        for (int i = n1 - 1; i >= 0; i--) { sum += a[i]; s1.push(sum); }
        sum = 0;
        s2.push(0);
        for (int i = n2 - 1; i >= 0; i--) { sum += b[i]; s2.push(sum); }
        sum = 0;
        s3.push(0);
        for (int i = n3 - 1; i >= 0; i--) { sum += c[i]; s3.push(sum); }
        while (true) {
            int x = s1.peek(), y = s2.peek(), z = s3.peek();
            if (x == y && y == z) {
                System.out.println(x);
                break;
            }
            if (x >= y && x >= z) s1.pop();
            else if (y >= x && y >= z) s2.pop();
            else s3.pop();
        }
    }
}