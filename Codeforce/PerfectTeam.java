import java.io.*;
import java.util.*;

public class PerfectTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int c = sc.nextInt();
            int m = sc.nextInt();
            int fuddu = sc.nextInt();
            if (c == 0 || m == 0) {
                System.out.println(0);
            } else {
                int minCo = Math.min(c, m);
                System.out.println(Math.min(minCo, (c + m + fuddu) / 3));
            }
        }
    }
}