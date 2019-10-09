import java.io.*;
import java.util.*;
public class ChooseTwoNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int max1=0;
        for(int i=0;i<n1;i++){
            max1=Math.max(max1,sc.nextInt());
        }
        int n2=sc.nextInt();
        int max2=0;
        for(int i=0;i<n2;i++){
            max2=Math.max(max2,sc.nextInt());
        }
        System.out.println(max1+" "+max2);
    }
}