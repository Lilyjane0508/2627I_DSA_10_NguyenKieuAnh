import java.util.*;
public class CountingSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[105];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[arr1[i]] += 1;
        }
        for (int x = 0; x <= 99; x++) System.out.print(arr2[x] + " ");
    }
}