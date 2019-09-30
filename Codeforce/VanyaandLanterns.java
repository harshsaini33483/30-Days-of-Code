import java.io.*;
import java.util.*;
public class VanyaandLanterns{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int l=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);       
        double max=2*Math.max(a[0],l-a[n-1]);
        for (int i=1;i<n;i++)
        {
            max=Math.max(max,a[i]-a[i-1]);
        }
        System.out.printf("%.10f",max/2);


    }

    //trying binary search
    public static float findDistance(int arr[],int l){
        float tempHigh=l;
        float tempLow=0F;
        float tempAns=Float.MAX_VALUE;
        while(tempLow<=tempHigh){
            float tempMid=tempLow+(tempHigh-tempLow)/2;
            float start=0F;
            boolean ok=false;
            for(int i=0;i<arr.length && start<l;i++){
                if(start+tempMid>=arr[i]){
                    start=start+tempMid;
                }else{
                    ok=true;
                    tempLow=tempMid;
                    break;
                }
            }
            if(start>=l){
                if(tempAns>tempMid){
                    tempAns=tempMid;
                }
                tempHigh=tempMid-0.5F;
            }else if(!ok){
                break;
            }
        }
        return tempAns;
    }
    
}