import java.io.*;
import java.util.*;

public class KeyboardLayouts {
    static class Poistion {
        int pos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Poistion arr[] = new Poistion[26];
        String s = sc.next();
        String t = sc.next();
        for (int i = 0; i < s.length(); i++) {
            Poistion temp = new Poistion();
            temp.pos = i;
            arr[s.charAt(i) - 97] = temp;
        }
        String trackStr = sc.next();
        String finalStr = "";
        for (int i = 0; i < trackStr.length(); i++) {
            char temp = trackStr.charAt(i);
            if (temp >= 'a' && temp <= 'z') {
                finalStr += t.charAt(arr[temp - 97].pos);
            } else if (temp >= 'A' && temp <= 'Z') {
                finalStr += (char) (t.charAt(arr[temp - 65].pos) - 32);
            } else {
                finalStr += trackStr.charAt(i);
            }
        }
        System.out.println(finalStr);
    }
}