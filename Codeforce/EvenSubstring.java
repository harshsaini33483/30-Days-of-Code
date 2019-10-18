import java.io.*;
import java.util.*;
public class EvenSubstring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        Long count=0L;
        for(int i=n-1;i>=0;i--){
            if(Integer.parseInt(str.charAt(i)+"")%2==0){
                ++count;
                count+=(i);
            }
        }
        System.out.println(count);
    }
}