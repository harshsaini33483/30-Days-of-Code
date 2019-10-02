import java.io.*;
import java.util.*;

public class VasyaandSocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int divideN = n;
        int countDays = n;
        int tempDays = 0;
        while (divideN >= m) {
            tempDays = (divideN % m);
            divideN = divideN / m;
            countDays += divideN;
            divideN += tempDays;
        }

        System.out.println(countDays);

    }
}