import java.io.*;
import java.util.*;

public class StringsEqualization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println(findAnswer(sc.next(), sc.next()));
        }
    }

    public static String findAnswer(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            if (t.indexOf(s.charAt(i)) >= 0) {
                return "YES";
            }
        }
        return "NO";
    }
}