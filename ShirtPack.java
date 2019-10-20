import java.io.*;
import java.util.*;
class ShirtPack{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(n+1==m){
                System.out.println(1);
            }else if((n%2==0 && m%2==0) || n==m){
                System.out.println(-1);
            } 
           else{
                System.out.println(hardWay(n, m));
             }
           } 
    }
    public static int hardWay(int n,int m){
        int i=1;
        while(i<10000){
            double temp0=(((double)n*i)+1)/(double)m;
            int temp1=((n*i)+1)/m;
            if(temp1-temp0==0.0){
                return temp1;
            }
            ++i;
        }
        return -1;
    }
}