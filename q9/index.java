package q9;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        String first = arr[0];
        arr[0] = arr[0].toLowerCase();
        LinkedHashMap < String, Boolean > map = new LinkedHashMap < String, Boolean > ();
        for (int i = 0; i < arr.length; i++)
            map.put(arr[i], true);
        Set s = map.entrySet();
        Iterator itr = s.iterator();
        System.out.print(first + " ");
        int j = 0;
        while (itr.hasNext()) {
            Map.Entry m = (Map.Entry) itr.next();
            if ((Boolean) m.getValue() == true && j == 1)
                System.out.print(m.getKey() + " ");
            j = 1;
        }
    }
}
