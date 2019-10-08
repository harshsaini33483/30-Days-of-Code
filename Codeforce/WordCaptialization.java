import java.io.*;
import java.util.*;

public class WordCaptialization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print((str.charAt(0) + "").toUpperCase() + "" + str.substring(1));
    }
}