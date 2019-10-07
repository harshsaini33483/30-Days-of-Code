import java.io.*;
import java.util.*;

public class Knights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 0) {
                        System.out.print("W");
                    } else {
                        System.out.print("B");
                    }
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 0) {
                        System.out.print("B");
                    } else {
                        System.out.print("W");
                    }
                }
            }
            System.out.println("");
        }
    }
}