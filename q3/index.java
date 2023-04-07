package q3;
import java.util.*;
public class index {
    public static void possibilities(int n) {
        int c = 0;
        String b = "";
        for (int i = 1; n != c; i++) {
            String s = Integer.toString(i, 2);
            if (!s.contains("11")) {
                c++;
                b = s;
            }
        }
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] a = new int[tc];
        for (int i = 0; i < tc; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < tc; i++) {
            possibilities(a[i]);
        }
    }
}