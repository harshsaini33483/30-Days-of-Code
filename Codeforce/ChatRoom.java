import java.util.*;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String findString = "hello";
        int j = 0;
        for (int i = 0; i < str.length() && j < findString.length(); i++) {
            if (str.charAt(i) == findString.charAt(j)) {
                ++j;
            }
        }
        if (j == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}