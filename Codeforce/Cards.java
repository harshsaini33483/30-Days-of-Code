import java.io.*;
import java.util.*;
public class Cards{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        int one=0,zero=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='n'){
                ++one;
            }else if(str.charAt(i)=='z'){
                ++zero;
            }
        }
        for(int i=0;i<one;i++){
            System.out.print(1+" ");
        }
        for(int i=0;i<zero;i++){
            System.out.print(0+" ");
        }

    }
}
