import java.io.*;
import java.util.*;
public class CinemaLine{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int save25=0,save50=0;
        boolean ok=true;
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            if(temp==25){
                ++save25;
            }else if(temp==50){
                if(save25<=0){
                    ok=false;
                }else{
                    --save25;
                    ++save50;
                }
            }else if(temp==100){
                if(save50>0 && save25>0){
                    --save50;
                    --save25;
                }else if(save25>=3){
                        save25-=3;
                }else{
                    ok=false;
                    break;
                }
                
                }
            }
        
        if(ok){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}