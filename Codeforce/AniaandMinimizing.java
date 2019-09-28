import java.io.*;
import java.util.*;
public class AniaandMinimizing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nk[]=new int[2];
        nk[0]=sc.nextInt();
        nk[1]=sc.nextInt();
        int n=nk[0];
        int k=nk[1];
        String num=sc.next();
    
        if(k==0){
            System.out.println(num);
        }       
        else if(n==1 && k==1){
            System.out.println(0);
        }
        else{
            System.out.println(minimumNumber(num,k));
        }
    }

    public static String minimumNumber(String num,int k){
        char charNum[]=num.toCharArray();
        if(k>=1 && charNum[0]!='1'){
            charNum[0]='1';
            --k;
        }
        for(int i=1; i<num.length() && k>0;i++){
            if(charNum[i]!='0'){
                charNum[i]='0';
                --k;
            }
        }

        return new String(charNum);
    }
}