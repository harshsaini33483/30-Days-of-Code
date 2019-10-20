import java.io.*;
import java.util.*;
public class GoodString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            String str=sc.next();
            if(n==1){
                System.out.println(0);
                continue;
            }
            int j=0;
            for(;j<n;j++){
                if(str.charAt(j)=='>'){
                    break;
                }
            }
            int j1=n-1;
            for(;j1>=0;j1--){
                if(str.charAt(j1)=='<'){
                    break;
                }
            }
            System.out.println(Math.min(j,n-(j1+1)));
        }
    }
}