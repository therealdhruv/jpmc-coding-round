package q2;
import java.util.*;
public class index {
    public static int func(String s, int n, int i) {
        if (n < 0)
            return 0;
        return (s.charAt(n) - 'a' + 1) * (int) Math.pow(20, i) + func(s, n - 1, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(func(str, str.length() - 1, 0));
    }
}