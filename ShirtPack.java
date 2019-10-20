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
            }
           else{
            int count=0,mD=m,nD=n;
            while(true){
                if(nD+1==mD){
                    System.out.println(count);
                    break;
                }
                else if(nD>mD){
                    mD=mD+m;
                     ++count;
                }else{
                    nD=nD+n;
                }
               
            }
        }
           } 
    }
}