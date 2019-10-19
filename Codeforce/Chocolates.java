import java.io.*;
import java.util.*;
public class Chocolates{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int max=Integer.MAX_VALUE;
        Long count=0L;
        for(int i=n-1;i>=0;i--){
            if(max-1>=array[i]){
                count+=array[i];
                max=array[i];
            }else if(array[i]>max-1 && max-1>0){
                count+=(max-1);
                max=max-1;
            }
        }
        System.out.println(count);
    }
}