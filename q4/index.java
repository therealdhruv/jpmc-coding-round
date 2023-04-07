package q4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class index {
    static ArrayList < ArrayList < Integer >> a;
    static int n, m, t;
    static int ans = 0, sum = 0;
    static Map < Integer, Integer > mm = new HashMap < Integer, Integer > ();
    static void answer(int i, int j, int num, ArrayList < ArrayList < Integer >> a2) {
        if (i == n - 1 && j == m - 1) {
            if (mm.get(num) == null) {
                mm.put(num, 1);
                ans++;
                sum += num;
            }
            return;
        }
        if (i == n - 1) {
            answer(i, j + 1, num + a2.get(i).get(j), a2);
            return;
        }
        if (j == m - 1) {
            answer(i + 1, j, num + a2.get(i).get(j), a2);
            return;
        }
        answer(i + 1, j, num + a2.get(i).get(j), a2);
        answer(i, j + 1, num + a2.get(i).get(j), a2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ArrayList < ArrayList < Integer >> arr = new ArrayList < ArrayList < Integer >> ();
        for (int i = 0; i < n; i++) {
            ArrayList < Integer > temp = new ArrayList < Integer > ();
            for (int j = 0; j < m; j++) {
                temp.add(sc.nextInt());
            }
            arr.add(temp);
        }
        a = arr;
        answer(0, 0, 0, a);
        System.out.println(ans + "\n" + sum);
    }
}
