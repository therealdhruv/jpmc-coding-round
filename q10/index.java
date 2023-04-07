package q10;

import java.util.ArrayList;
import java.util.Scanner;

public class index {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 5; i * i <= n; i = i + 6)
            if ((n % i == 0) || (n % (i + 2) == 0))
                return false;
        return true;
    }
    public static int solve(int n, int k) {
        int c = 0;
        ArrayList < Integer > list = new ArrayList < > ();
        for (int i = n + 1; c < k; i++) {
            int temp = i;
            int sum = 0;
            while (temp != 0) {
                sum = sum + temp % 10;
                temp = temp / 10;
            }
            if (isPrime(sum)) {
                list.add(i);
                c++;
            }
        }
        return list.get(k - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solve(n, k));
    }
}
