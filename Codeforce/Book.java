import java.io.*;
import java.util.*;
public class Book{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int limit=sc.nextInt();
        int arr[]=new int[n];
        int sumArr[]=new int[n+1];
        int max=0;
        sumArr[0]=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sumArr[i+1]=arr[i]+sumArr[i];
        }
        int i=0,j=1;
        while(i<=n && j<=n){
            if(sumArr[j]-sumArr[i]<=limit){
                if(max<(j-i)){
                    max=j-i;
                }
                ++j;
            }else{
                if(i==j){
                    ++i;
                    ++j;
                }else{
                    ++i;
                }
            }
        }
        System.out.println(max);
    }
}