import java.io.*;
import java.util.*;

// 4 1 0
// 4
// 5 3 4  3
// 2 1 0   1
// 3 5 5    2
// 4 10 6   0
public class CreatingaCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double two = 2D;
        for (int i = 0; i < n; i++) {
            int str = sc.nextInt();
            int len = sc.nextInt();
            int exp = sc.nextInt();
            if (exp == 0 && str > len) {
                System.out.println(1);
            } else if (exp == 0 && str < len) {
                System.out.println(0);
            } else {
                str += exp;
                int temp = str - len;
                if (temp > 0) {
                    System.out.println(Math.min(exp + 1, (temp + 1) / 2));
                } else {
                    System.out.println(0);
                }
            }

        }
    }
}