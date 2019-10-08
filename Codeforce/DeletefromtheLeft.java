import java.io.*;
import java.util.*;

public class DeletefromtheLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int i = s.length() - 1, j = t.length() - 1;

        for (; i >= 0 && j >= 0; i--, j--) {
            if (s.charAt(i) != t.charAt(j)) {
                break;
            }
        }
        System.out.println(i + 1 + j + 1);
    }
}