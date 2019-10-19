import java.io.*;
import java.util.*;
public class TheDoors{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int zero=0,one=0;
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            if(temp==0){
                zero=i;
            }else{
                one=i;
            }
        }
        System.out.println(Math.min(zero,one)+1);
    }
}