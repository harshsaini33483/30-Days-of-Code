import java.io.*;
import java.util.*;
public class Twin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            sum+=array[i];
        }
        Arrays.sort(array);
        int count=0;
        int tempSum=0;
        for(int i=n-1;i>=0;i--){
            if(sum<tempSum){
                break;
            }else{
                sum =sum-array[i];
                tempSum+=array[i];
                ++count;
            }
        }
        System.out.println(count);
    }
}