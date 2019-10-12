import java.io.*;
import java.util.*;
public class CountingKangaroosisFun{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        boolean check[]=new boolean[n];
        Arrays.fill(check,false);
        int i=n-1,j=(n-2)/2,count=0;
        while(i>=0 && j>=0){
            if(check[i]){
                --i;
            }else if(check[j]){
                --j;
            }else if(array[j]*2<=array[i]){
                check[i]=true;
                check[j]=true;
                --i;
                --j;
                ++count;
            }else{
                --j;
            }
        }
        for(int k=0;k<n;k++){
            if(!check[k]){++count;}
        }
        System.out.println(count);
    }

    
}