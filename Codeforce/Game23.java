import java.io.*;
import java.util.*;
public class Game23{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double b=sc.nextDouble();
        double a=sc.nextDouble();
        double k1=a/b;
        int k2=(int)a/(int)b;
        if(k1-k2!=0.0){
            System.out.println(-1);
        }else{
            int count=0;
            boolean ok=true;
            while(k2>1){
                if(k2%2==0){
                    ++count;
                    k2=k2/2;
                }else if(k2%3==0){
                    ++count;
                    k2=k2/3;
                }else{
                    ok=false;
                    break;
                }
            }
            if(ok){
                System.out.println(count);
            }else{
                System.out.println(-1);
            }
        }
    }
}