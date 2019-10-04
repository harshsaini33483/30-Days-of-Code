import java.io.*;
import java.util.*;

public class NewYearandHurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int timeLeft = 240 - k;
        int left = 0;
        int right = n;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            int minTook = 5 * ((mid * mid) + (mid)) / 2;
            if (minTook == timeLeft) {
                break;
            }
            if (minTook < timeLeft) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(Math.min(right, mid));
    }
}