import java.io.*;
import java.util.*;
public class DetectiveBook{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt()-1;
        }

        int min=array[0];
        int i=0,count=1;
        while(i<n){
            int j=i;
           for(;j<=min && j<n;j++){
               if(array[j]>=min){
                   min=array[j];
               }
           }
           i=j;
           if(i<n){
                ++count;
                min=array[i];
           }
        }
        System.out.println(count);

    }
}