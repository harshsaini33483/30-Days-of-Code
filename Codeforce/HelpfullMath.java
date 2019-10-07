import java.io.*;
import java.util.*;

public class HelpfullMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.next().split("\\+");
        int arr[] = new int[3];
        for (String tempSt : str) {
            if (tempSt.equals("1")) {
                ++arr[0];
            } else if (tempSt.equals("2")) {
                ++arr[1];
            } else {
                ++arr[2];
            }
        }
        String finalAns = "";
        for (int i = 0; i < arr[0]; i++) {
            finalAns += "1+";
        }
        for (int i = 0; i < arr[1]; i++) {
            finalAns += "2+";
        }
        for (int i = 0; i < arr[2]; i++) {
            finalAns += "3+";
        }
        System.out.println(finalAns.substring(0, finalAns.length() - 1));
    }
}