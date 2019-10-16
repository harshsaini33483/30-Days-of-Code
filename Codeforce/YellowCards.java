import java.util.*;
import java.io.*;
public class YellowCards{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int k1=sc.nextInt();
        int k2=sc.nextInt();
        int total=sc.nextInt();
        System.out.print(minimumReq(a1, a2, k1, k2, total));
        System.out.print(" "+maximumReq(a1, a2, k1, k2, total));
        
    }


    public static int minimumReq(int a1,int a2,int k1,int k2,int total){
        int min1=(a1*(k1-1));
        if(min1>=total){
           return 0;
        }
        int min2=a2*(k2-1);
        if(min2>=total){
            return 0;
        }else if(min1+min2>=total){
            return 0;
        }
        int remain=total-(min1+min2);
        if(a1>remain){
            return remain; 
        }else{
            if(remain-a1>a2){
                return a1+a2;
            }else{
                return remain;
            }

        }

    }
    
    public static int maximumReq(int a1,int a2,int k1,int k2,int total){
        if(k1<k2){
            int count=0;
            if(k1*a1>total){
                int remaining=total;
                for(int i=0;i<a1;i++){
                    int temp=remaining-k1;
                    if(temp>=0){
                        ++count;
                        remaining=remaining-k1;
                    }else{
                        break;
                    }
                }
                return count;
            }else{
                count=a1;
                int remaining=total-(a1*k1);
                for(int i=0;i<a2;i++){
                    int temp=remaining-k2;
                    if(temp>=0){
                        ++count;
                        remaining=remaining-k2;
                    }else{
                        break;
                    }
                }
                return count;
            }
        }else{
            int count=0;
            if(k2*a2>total){
                int remaining=total;
                for(int i=0;i<a2;i++){
                    int temp=remaining-k2;
                    if(temp>=0){
                        ++count;
                        remaining=remaining-k2;
                    }else{
                        break;
                    }
                }
                return count;
            }else{
                count=a2;
                int remaining=total-(a2*k2);
                for(int i=0;i<a1;i++){
                    int temp=remaining-k1;
                    if(temp>=0){
                        ++count;
                        remaining=remaining-k1;
                    }else{
                        break;
                    }
                }
                return count;
            }
        }
    }
}