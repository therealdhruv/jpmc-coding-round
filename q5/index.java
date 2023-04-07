package q5;

import java.util.Scanner;

public class index {
    static String s;
    static int ans;
    public static void func(int i, int n) {
        if (i == n - 1 || i == n) {
            ans++;
            return;
        }
        if (s.charAt(i) == '1')
            func(i + 2, n);
        else if (s.charAt(i) == '2' && s.charAt(i + 1) < '7')
            func(i + 2, n);
        func(i + 1, n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        func(0, s.length());
        System.out.println(ans);
    }
}
