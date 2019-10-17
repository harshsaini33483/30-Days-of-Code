import java.io.*;
import java.util.*;
public class BadPrices{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int array[]=new int[n];
            for(int j=0;j<n;j++){
                array[j]=sc.nextInt();
            }
            int min=Integer.MAX_VALUE;
            
            int count=0;

            for(int j=n-1;j>=0;j--){
                if(min<array[j]){
                    ++count;
                }else if(min>array[j]){
                    min=array[j];
                }
            }
            System.out.println(count);
        }
    }
}